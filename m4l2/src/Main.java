import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Create courses
        Course compSci = new Course("Computer Science", "1836");
        Course stem = new Course("Math or comething", "784865");

        //Create array
        ArrayList<Student> studentRecords = new ArrayList<Student>();

        // Init students
        studentRecords.add(new Student(
                "John",
                "Doe",
                4534134,
                compSci,
                2023
        ));
        studentRecords.add(new Student(
                "Jane",
                "Doe",
                8663841,
                compSci,
                2019
        ));
        studentRecords.add(new Student(
                "John",
                "Smith",
                4564564,
                stem,
                2050
        ));
        displayAllStudents(studentRecords);

    }
    public static void displayAllStudents(ArrayList<Student> records){
        System.out.println("All students: ");
        for (Student student : records ) {
            student.printSelf(1);
        }
    }
}