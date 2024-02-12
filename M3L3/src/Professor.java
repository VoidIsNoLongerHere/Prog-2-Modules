public class Professor {
    String name, department;
    Course course;

    //Constructor
    public Professor(String name, String department, Course course) {
        this.name = name;
        this.department = department;
        this.course = course;
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
