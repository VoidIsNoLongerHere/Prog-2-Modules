/*
Landon Norman
Module 1 Lab 3
1/23/24
Purpose: Calculate MPG
*/

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        // Init
        int digits;
        double miles, gallons, mpg;
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        //Input
        System.out.print("How many miles did you drive?: ");
        miles = s.nextDouble();

        System.out.print("How many gallons of gas did you use?: ");
        gallons = s.nextDouble();

        //Logic
        mpg = miles/gallons;



        // Out


        System.out.print("-----------------");
        System.out.print("\nMiles Driven: " + miles );
        System.out.print("\nGallons Used: " + gallons );
        System.out.print("\nYour mpg is: " + df.format(mpg) + " Gallons");


    }
}