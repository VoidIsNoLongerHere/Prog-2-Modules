public class Student {

    //Var
    String fName, lName;
    Address home;
    ParkingPermit permit;

    //Constructor

    public Student(String fName, String lName, Address home, ParkingPermit permit) {
        this.fName = fName;
        this.lName = lName;
        this.home = home;
        this.permit = permit;
    }
    //MMethod
    public void printStudentInfo(){
        System.out.println("\n\n"+fName + " " + lName);
        System.out.println("----------------------------");
        home.printAddress();
        System.out.println();
        permit.printInfo();
    }

    //get/set

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Address getHome() {
        return home;
    }

    public void setHome(Address home) {
        this.home = home;
    }

    public ParkingPermit getPermit() {
        return permit;
    }

    public void setPermit(ParkingPermit permit) {
        this.permit = permit;
    }
}
