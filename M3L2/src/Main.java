//Landon Norman
//Modules 3 Lab 2
//2/8/2024
//Purpose: Many Many more classes parking permit have no clue man

public class Main {
    public static void main(String[] args) {

        Header h = new Header();
        h=null;

        IOSimplfier i = new IOSimplfier(); // My custom Input Class, i absolutely hate sout


        String fName = i.inStr("Please enter your first name: ");
        String lName = i.inStr("Please enter your last name: ");

        Address tempHome = new Address(
                i.inStr("Please enter your address: "),
                i.inStr("Please enter your city: "),
                i.inStr("Please enter your state abbreviation: "),
                i.inStr("Please enter your zip code: ")
        );

        ParkingPermit tPermit = new ParkingPermit(
                i.inStr("Please enter your car's make: "),
                i.inStr("Please enter your car's model: "),
                i.inStr("Please enter your car's year: ")
        );

        Student s = new Student(fName,lName ,tempHome, tPermit);


        tempHome = null;
        tPermit = null;
        System.gc();

        s.printStudentInfo();







    }
}