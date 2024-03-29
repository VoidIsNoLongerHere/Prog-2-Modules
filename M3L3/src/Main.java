// Landon Norman
// Module 3 Lab 3
// 2/13/2024
// Purpose: Many classes, lots of data, encapsulation, basic io though

public class Main {
    public static void main(String[] args) {
        // Init
        final int INDENT = 1;
        IOSimplfier i = new IOSimplfier(); // I did make this, essentially is just input func from python and uses scanner as the base

        // Create all the classes with input from user
        Course course = new Course(
                i.inStr("Please enter the Course name: "),
                i.inStr( "Please enter the course code: ")
        );

        Professor professor = new Professor(i.inStr("Please enter the professor's name: "),
                i.inStr("Please enter the department: "),
                course //Course Class
        );

        University university = new University(
                i.inStr("Please enter the university's name: "),
                i.inStr("Please enter the university's location: "),
                professor // Professor Class
        );

        // print details
        university.print(INDENT);



    }
}