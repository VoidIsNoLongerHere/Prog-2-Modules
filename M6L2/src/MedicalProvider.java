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
    public abstract void printInfo();


}
