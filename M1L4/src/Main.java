// Landon Norman
// Module 1 Lab 4
// 1/23/24
// Purpose: Calculator



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Init
        Scanner s = new Scanner(System.in);
        double num1, num2, result = 0;

        // Input
        System.out.print("Please enter the first number: ");
        num1 = s.nextDouble();

        System.out.print("Please enter the second number: ");
        num2 = s.nextDouble();

        System.out.println("What would you like to do?: \n\t1: Add\n\t2: Subtract\n\t3: Multiply\n\t4: Divide");
        System.out.print("Please enter your choice: ");

        // Logic
        boolean valid = true;

        do{
            valid = true;
            switch (s.nextInt()){
                case 1:{
                    result = num1+num2;
                    break;
                }
                case 2:{
                    result = num1-num2;
                    break;
                }
                case 3:{
                    result = num1*num2;
                    break;
                }
                case 4:{
                    result = num1/num2;
                    break;
                }
                default: {
                    System.out.print("\nPlease Enter a valid selection: ");
                    valid = false;
                }
            }}while (!valid);

        //Output
        System.out.println("Your result is: " + result);



    }
}