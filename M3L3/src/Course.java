public class Course {
    //Var
    String name, code;

    //Constructor
    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }
    //method
    public void print(String tabs){
        // The passed variable type changes to a string to make it easier to

        System.out.println(tabs+"    └── Course:");
        tabs += "\t";
        System.out.println(tabs+"    ├── Name: "+name);
        System.out.println(tabs+"    └── Code: "+code);
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
