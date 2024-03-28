public abstract class MedicalProvider {
    protected String firstName, lastName;
    protected String employeeID;
    protected OfficeLocation office;

    //Constructor
    public MedicalProvider() {}

    public MedicalProvider(String firstName, String lastName, String employeeID, OfficeLocation office) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.office = office;
    }
    //Methods
    public void printInfo(){
        System.out.println(firstName + " " + lastName +":");
        System.out.printf("Employee ID: %s\n", employeeID);
        office.printInfo();
    }


}
