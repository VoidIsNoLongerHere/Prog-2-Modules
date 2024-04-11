import com.github.javafaker.Faker;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Objects;

public class BookStore
{
    private ArrayList<Customer> customers;
    private ArrayList<Book> books;

    private final NumberFormat priceConverter = NumberFormat.getCurrencyInstance();

    //Constructor


    public BookStore() {
        books = new ArrayList<>();
        customers = new ArrayList<>();
    }

    /**
     * Instantiates BookStore and creates multiple Customer and Book objects with random data
     * @param objects int Number of objects to create
     */
    public BookStore(int objects) {
        books = new ArrayList<>();
        customers = new ArrayList<>();
        createRandomData(objects);
    }

    //Methods

    /**
     * Uses Faker class to create an amount of fake Customer and Book Objects
     * @param amount int Number of objects to create
     */
    private void createRandomData(int amount){
        Faker faker = new Faker();
        for (int i = 0; i < amount; i++) {

            addBook(new Book(
                    faker.book().title(),
                    faker.name().fullName(),
                    faker.number().digits(16),
                    faker.number().randomDouble(2 , 0 , 100)
            ));

            addCustomer(new Customer(
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.number().digits(5)
            ));
        }
        faker = null;
        System.gc();
    }



    /**
     * Main Menu of the book store using a sentinel controlled while loop.
     */
    public void menu(){
        while (true){
            System.out.println("""
                    Main Menu:
                    ------------------------
                    1. Books
                    2. Customers
                    0. Exit
                    """);
            Integer prompt = InGen.in("Please enter an option: ", Integer.class);

            switch (prompt){
                case 2:{
                    customerMenu();
                    break;
                }
                case 1:{
                    bookMenu();
                    break;
                }
                case 0:{
                    System.exit(0);
                }
            }
        }
    }

    public void bookMenu(){
        System.out.println("""
                Book Menu:
                -----------------
                1. Find a Book
                2. List All Books
                3. Purchase a Book
                4. Add a Book""");
        Integer prompt = InGen.in("Please enter an option: ", Integer.class);
        switch (prompt){
            case 1:
                findBook();
                break;
            case 2:
                listBooks();
                break;
            case 3:
                purchase();
                break;
            case 4:
                addBook();
                break;
            default:
                break;
        }
    }

    public void customerMenu(){
        System.out.println("""
                Customer Menu:
                --------------------
                1. Find a customer
                2. Register new customer
                3. List all customers""");
        Integer prompt = InGen.in("Please enter an option: ", Integer.class);
        switch (prompt){
            case 1:
                findCustomer();
            case 2:
                addCustomer();
            case 3:
                listCustomers();
        }
    }

    /**
     * Prompts the user for a string to search all the books in list for.
     */
    public void findBook(){
        String item = InGen.in("Search query (Any Attribute): ", String.class);
        ArrayList<Book> matching = matchBooks(item);

        if (matching.isEmpty()) {
            System.out.println("No matches.");
            return;
        }
        matching.forEach(Book::print);

        boolean wantToBuy = InGen.in("Would you like to buy any of these books? (Y/N): ", String.class).equalsIgnoreCase("y");
        if (matching.size() > 1 && wantToBuy ){
            purchase(select(matching));
        } else if (wantToBuy) {
            purchase(matching.getFirst());
        }
    }

    /**
     * Determines if book matches string passed by findBook
     * @param item String Search query
     * @return ArrayList<Book> of matching books
     */
    private ArrayList<Book> matchBooks(String item){
        ArrayList<Book> matching = new ArrayList<>();
        for (Book book : books){
            if (book.search(item)){
                matching.add(book);
            }
        }
        return matching;
    }

    /**
     * selects from list of matching books
     * @param matching
     * @return
     */
    private Book select(ArrayList<Book> matching) {
        int ticker = 1;
        int prompt;
        boolean valid = false;
        if (matching.isEmpty()){return null;}

        for (Book book : books) {
            System.out.println("Option " + ticker++ + ":");
            book.print();
        }

        do {
            prompt = InGen.in("Please enter the number of the book you would like to select: ", Integer.class) - 1;
            if (prompt >= ticker || prompt < 0) {
                System.out.println("Invalid option");
                continue;
            }
            valid = true;
        } while (!valid);
        return matching.get(prompt);
    }

    /**
     * Iterates through books in library and print() them
     */
    public void listBooks(){
        System.out.println("Entire Library:");
        books.forEach(Book::print);
    }


    private Customer findCustomer(String id){
        for (Customer customer : customers){
            if (Objects.equals(customer.getId(), id)){
                return customer;
            }
        }
        return null;
    };

    /**
     * Looks through customers list and tests if it matches.
     * Prompts console to query
     */
    public void findCustomer(){
        String item =InGen.in("Please enter the customer you would like to search for: ", String.class);
        for (Customer customer:customers){
            if (customer.search(item)){customer.print();}
        }

    }

    /**
     * Prompts user to search for a book then removes it if purchased
     */
    public void purchase(){
        ArrayList<Book> matching = matchBooks(InGen.in("Search query (Any Attribute): ", String.class));
        Book book = select(matching);


        if (book != null) {
            String price = priceConverter.format(book.getPrice());
            if (InGen.in("The book \"" + book.getTitle() + " is " + price + ". Would you like to buy it? (Y/N): ", String.class).equalsIgnoreCase("y")) {
                books.remove(book);
                System.out.println("You have bought " + book.getTitle() + "!");

            } else {
                System.out.println("Purchase Cancelled.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    /**
     * Prompts for purchaser then removes book object from list.
     * @param book Book object to purchase from list.
     */
    public void purchase(Book book){
        if (book != null) {
            String price = priceConverter.format(book.getPrice());
            if (InGen.in("The book \"" + book.getTitle() + "\" is " + price + ". Would you like to buy it? (Y/N): ", String.class).equalsIgnoreCase("y")) {
                books.remove(book);
                System.out.println("You have bought " + book.getTitle() + "!");

            } else {
                System.out.println("Purchase Cancelled.");
            }
        } else {
            System.out.println("Book not found.");
        }
    };

    /**
     * Adds a book object to list
     * @param book
     */
    public void addBook(Book book){
        books.add(book);
    };
    /**
     * Adds a book object to list, prompts user for attributes
     */
    public void addBook(){
        books.add(new Book(
                InGen.in("What is the title of the book?: ", String.class),
                InGen.in("Who is the author?: ", String.class),
                InGen.in("What is the ISBM?", String.class),
                InGen.in("What is the price? $", Double.class)
        ));
    }

    /**
     * Adds a customer object to list
     * @param customer Customer to add
     */
    public void addCustomer(Customer customer){
        customers.add(customer);
    };

    /**
     * Creates and adds new customer to list
     */
    public void addCustomer(){
        addCustomer(new Customer(
                InGen.in("Customer's first name?: ", String.class),
                InGen.in("Customer's last name?: ", String.class),
                InGen.in("Customer's id? ", String.class)
        ));
    }

    public void listCustomers(){
        customers.forEach(Customer::print);
    }
}
