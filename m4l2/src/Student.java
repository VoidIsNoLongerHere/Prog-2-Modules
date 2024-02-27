public class Student extends Branch {
    String fName;
    String lName;
    int id;
    Course course;
    int year;

    public Student(String fName, String lName, int id, Course course, int year) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
        this.year = year;
        this.course = course;
    }


    public void printSelf(int depth){
        String tabs = getTabs(depth);

        System.out.println(tabs+ id +":");
        tabs += "\t";

        System.out.println(tabs +"Name: "+ fName + " " + lName);
        course.printSelf(depth+1);
        System.out.println(tabs + "Year of study: "+ year);
    }

    //Get/set

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
