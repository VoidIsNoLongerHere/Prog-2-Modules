import java.util.ArrayList;

public class Employee implements Leaflet{
    //Var
    protected String employeeID, fName, lName;


    protected ArrayList<Leaflet> children = new ArrayList<>();


    //Constructor

    public Employee(String employeeID, String fName, String lName, Benefit employeeBenefit, Address employeeAddress) {
        this.employeeID = employeeID;
        this.fName = fName;
        this.lName = lName;
        this.addChild(employeeBenefit);
        this.addChild(employeeAddress);
    }

    //Method
    public void printSelf(int depth){
        System.out.println(tabs(depth++)+fName +" "+ lName +":");
        System.out.println(tabs(depth)+"EID: "+ employeeID);
        this.printChildren(depth);
    }

    @Override
    public void addChild(Leaflet child) {
        children.add(child);
    }

    @Override
    public void printChildren(int depth) {
        for (Leaflet child: children){
            child.printSelf(depth);
        }
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
