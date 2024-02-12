public class University {
    // var
    String name, location;
    Professor professor;

    // Constructor

    public University(String name, String location, Professor professor) {
        this.name = name;
        this.location = location;
        this.professor = professor;
    }
    //Functions
    public void print(int indent){
        System.out.println("University Name: " + name);
        System.out.println("└── Location: "+location);
        professor.print(indent);
    }

    // Get/Set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
