public class Manager implements Employee{

    private String department,name;
    private int empId;

    public Manager(int empId, String name, String department) {
        this.department = department;
        this.name = name;
        this.empId = empId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.printf("Manager ID: %d Name: %s Department: %s%n", empId, name, department);
    }
}
