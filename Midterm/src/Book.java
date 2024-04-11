import java.text.NumberFormat;

public class Book {
    private String title, author, isbm;
    private Double price;


    //Constructor
    public Book(String title, String author, String isbm, Double price) {
        this.title = title;
        this.author = author;
        this.isbm = isbm;
        this.price = price;
    }

    //methods
    /**
     * Prints all data from attributes in attractive way
     */
    public void print(){
        NumberFormat c = NumberFormat.getCurrencyInstance();
        System.out.printf("""
                ----------------------------------------------
                %s:
                    Author: %s
                    ISBM: %s
                    Price: %s
                ----------------------------------------------
                """, title, author, isbm, c.format(price));
    }


    /**
     * Searches all attributes of the class for a string (case-insensitive)
     * <p>
     * Priority is Title > Author > ISBM > Price
     *
     * @param item Search Query
     * @return True - If any attribute matches the query
     *
     */
    public Boolean search(String item){
        if (title.equalsIgnoreCase(item)) {return true;}
        else if (author.equalsIgnoreCase(item)) {return true;}
        else if (isbm.equalsIgnoreCase(item)) {return true;}
        else return price.toString().equalsIgnoreCase(item);

    }


    //Get/Set

    /**
     *
     * @return String - Title of book
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title String New title var
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String - Book Author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * @return String - ISBM
     */
    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }
    /**
     * @return Double - Book price
     */
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
