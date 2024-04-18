
public class Main{
    public static void main(String[] args)
    {
        Employee dev1 = new Developer(100, "Fred Flintstone", "Pro Developer");
        Employee dev2 = new Developer(101, "Bart Simpson", "Developer");
        Employee intern = new Intern("Jeff Goldblum", "UT");
        Employee manager=  new Manager(102, "Steve", "DevOps");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);
        engDirectory.addEmployee(intern);
        engDirectory.addEmployee(manager);


        engDirectory.showEmployeeDetails();
    }
}


