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
        // The input type changes for formatting here

        System.out.println(tabs+"    └── Course:");
        tabs = tabs + "\t";
        System.out.println(tabs+"    ├── Name: "+name);
        System.out.println(tabs+"    └── Code: "+code);
    }

    public void print(){
        System.out.println("Course");
        System.out.println("\t"+"Course name: "+name);
        System.out.println("\t"+"Course code: "+code);
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
