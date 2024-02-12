public class Professor {
    String name, department;
    Course course;

    //Constructor
    public Professor(String name, String department, Course course) {
        this.name = name;
        this.department = department;
        this.course = course;
    }
    //Methods
    public void print(int indent){
        String tabs = "\t";
        for (int i = 1; i < indent; i++){
            tabs = tabs+"\t";
        }

        System.out.println(tabs+"└── Professor:");
        System.out.println(tabs+"    ├── Name: "+name);
        System.out.println(tabs+"    ├── Department: "+department);
        // Course is on same indent level so tree is not ended here
        course.print(tabs);
    }
    // Get/Set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
