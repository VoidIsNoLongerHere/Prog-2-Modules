import java.util.ArrayList;
import java.util.List;

//Composite
class CompanyDirectory implements Employee {
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
        countEmployees();
    }
    public void countEmployees(){
        System.out.printf("There are currently %d employees.%n", employeeList.size());
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}