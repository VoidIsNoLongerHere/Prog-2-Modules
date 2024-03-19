public class Doctor extends MedicalProvider{

    //Var
    private String specialty;
    private String licenceNumber;
    private String roomNum;
    private String salary;

    //Constructor
    public Doctor(String firstName, String lastName, String employeeID, OfficeLocation office, String specialty, String licenceNumber, String roomNum, String salary) {
        super(firstName, lastName, employeeID, office);
        this.specialty = specialty;
        this.licenceNumber = licenceNumber;
        this.roomNum = roomNum;
        this.salary = salary;
    }
    public Doctor() {}

    //Methods
    @Override
    public void printInfo() {
        
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
