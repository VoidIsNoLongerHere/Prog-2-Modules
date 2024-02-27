public class Course extends Branch{
    //Var
    String name, code;

    //Constructor
    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void printSelf(int depth){

        String tabs = getTabs(depth);

        System.out.println(tabs + "Course: ");
        tabs += "\t";

        System.out.println(tabs + "Name: " + name);
        System.out.println(tabs + "Code: " + code);
    }


    // Get/Set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
