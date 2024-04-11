// Landon Norman
// Module Midterm
// 4/2/2024
// Purpose: Book store



public class Main {
    public static void main(String[] args) {

        BookStore store = new BookStore(
                InGen.in("How many objects to create?: ", Integer.class)
        );

        store.listBooks();
        store.menu();


    }
}
