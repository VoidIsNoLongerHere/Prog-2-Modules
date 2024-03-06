public class Address implements Leaflet {

    //Variables
    String street;
    String city;
    String state;
    String zip;

    //Constructor

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = "";
    }

    public Address(Address tAddress){
        this.street = tAddress.getStreet();
        this.city = tAddress.getCity();
        this.state = tAddress.getState();
        this.zip = tAddress.getZip();
    }

    //Methods
    public void printSelf(int depth){
        System.out.println(tabs(depth)+"Address: ");
        System.out.println(tabs(depth)+street +",");
        System.out.println(tabs(depth)+city + ", " + state +",");
        System.out.println(tabs(depth)+zip);
    }


    //Get/Set

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

//Unimplemented Interface methods
    @Override
    public void addChild(Leaflet child) {}

    @Override
    public void printChildren(int depth) {}
}
