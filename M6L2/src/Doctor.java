import java.text.NumberFormat;

public class Doctor extends MedicalProvider{

    //Var
    private String specialty;
    private String licenceNumber;
    private String roomNum;
    private Double salary;

    //Constructor
    public Doctor(String firstName, String lastName, String employeeID, OfficeLocation office, String specialty, String licenceNumber, String roomNum, Double salary) {
        super(firstName, lastName, employeeID, office);
        this.specialty = specialty;
        this.licenceNumber = licenceNumber;
        this.roomNum = roomNum;
        this.salary = salary;
    }
    public Doctor() {}

    //Methods

    public void printInfo() {
        NumberFormat c = NumberFormat.getCurrencyInstance();
        super.printInfo();
        System.out.printf("Specialty: %s\n", specialty);
        System.out.printf("License Number: %s\n", licenceNumber);
        System.out.printf("Room Number: %s\n", roomNum);
        System.out.printf("Salary: %s\n\n", c.format(salary));
    }
    //Get/Set
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
