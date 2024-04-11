import java.util.Locale;

public class Customer {
    //Int
    private String firstName, lastName, id;

    //Constructor

    public Customer(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    //methods

    /**
     * Tests if any attribute matches search query (Case-Insensitive)
     * @param item String Search Query
     * @return Boolean - True if matches
     */
    public Boolean search(String item){
        if (firstName.equalsIgnoreCase(item)) {return true;}
        else if (lastName.equalsIgnoreCase(item)) {return true;}
        else return id.equalsIgnoreCase(item);
    }

    /**
     * Prints class data to console
     */
    public void print(){
        System.out.printf("""
                ----------------------------------------------
                Customer:
                    Name: %s
                    ID: %s%n
                ----------------------------------------------
                """, firstName+" "+lastName, id );
    }

    //Get/Set
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
