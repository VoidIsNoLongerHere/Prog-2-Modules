import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
import java.util.Random;

// Landon Norman
// ITSE-2457-003
// 1/18/24
// Purpose: Create random num generator

public class RandomNum {
    public static void main(String[] args) {

        // Define Vars
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        Random r = new Random();
        int tBound = 0, lBound = 1;

        //  Input Logic
        System.out.print("Please Enter Your Name: ");
        String name = scanner.nextLine();

        while (!valid) {
            System.out.print("Please Enter The Upper Bound: ");
            tBound = scanner.nextInt();

            System.out.print("Please Enter The Lower Bound: ");
            lBound = scanner.nextInt();

            if (tBound > lBound) {
                valid = true;
            } else {
                System.out.print("Upper Bound Must be greater than the Lower Bound.");
            }
        }

        int rNum;
        valid = false;

        do {
            rNum = r.nextInt(tBound);

            if (rNum > lBound) {
                valid = true;
            }
        } while (!valid);


        // Output
        System.out.print("Your name is: " + name + "\n");
        System.out.print("Your Random Number is: " + rNum);


    }
}