// Landon Norman
// Module 3 Lab 1
// 2/7/2024
// Purpose: Multiple classes stuff man

//please for the love of god can all of our input just be from a file
//I am really tied of typing everything



public class Main {
    public static void main(String[] args) {
        Benefit health = new Benefit(1234.56f, "Health Insurance", "United Health");
        Address home = new Address("123 example st.", "Somewhere", "TX", "12345");
        Employee worker = new Employee("1234567", "Steve" , "Robertson", health, home);

        worker.printEmployeeInfo();

    }
}