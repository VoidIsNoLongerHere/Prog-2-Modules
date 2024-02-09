public class Employee {
    //Var
    String employeeID, fName, lName;
    Benefit employeeBenefit; //WHY DID YOU MAKE ME SPELL BENEFIT :CCCCC
    Address employeeAddress;

    //Constructor

    public Employee(String employeeID, String fName, String lName, Benefit employeeBenefit, Address employeeAddress) {
        this.employeeID = employeeID;
        this.fName = fName;
        this.lName = lName;
        this.employeeBenefit = employeeBenefit;
        this.employeeAddress = employeeAddress;
    }

    //Method
    public void printEmployeeInfo(){
        System.out.println(fName + lName +":");
        System.out.printf("EID: ");
        System.out.println(employeeAddress.getAddress());
    }
    // Get/Set

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

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
}
