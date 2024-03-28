public class OfficeLocation {

    //Var
    private String officeName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;

    // Constructors
    public OfficeLocation(){}
    public OfficeLocation(String officeName, String phone, String address, String city, String state, String zip) {
        this.officeName = officeName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }

    public OfficeLocation(OfficeLocation Office){
        this.officeName = Office.getOfficeName();
        this.address = Office.getAddress();
        this.city = Office.getCity();
        this.state = Office.getState();
        this.zip = Office.getZip();
        this.phone = Office.getPhone();
    }

    //Method
    public void printInfo(){
        System.out.printf("Office name: %s\n", officeName);
        System.out.printf("Phone number: %s\n", phone);
        System.out.printf("Address: %s\n", address);
        System.out.printf("         %s", city);
        System.out.printf(", %s\n", state);
        System.out.printf("         %s\n", zip);
    }


    //Get/Set
    public String getPhone(){return phone;}
    public void setPhone(String phone){this.phone = phone;}

    public String getOfficeName() {
        return officeName;
    }
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
