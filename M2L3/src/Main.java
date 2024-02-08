// Landon Norman
// Module 2 Lab 3
// 1/30/2024
// Purpose: Create House Class

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Init
        Scanner s = new Scanner(System.in);


        //Var
        String address;
        int sqFeet, numBed;
        double numBath, price;

        //Input

        System.out.print("Please enter the address: ");
        address = s.nextLine();

        System.out.print("Please enter sqFeet: ");
        sqFeet = s.nextInt();

        System.out.print("Please enter number of bedrooms: ");
        numBed = s.nextInt();

        System.out.print("Please enter number of bathrooms: ");
        numBath = s.nextDouble();

        System.out.print("Please enter the price: $");
        price = s.nextDouble();


        // Call Class
        House h = new House(address, sqFeet, numBed, numBath, price);

        while (true){
            System.out.print("Please enter the new price ($-1 to break): $");
            price = s.nextDouble();

            if (price != -1) {
                h.setPrice(price);
                System.out.println("The new $/SqFt is: " + h.pricePerSqFoot());
            } else {
                break;
            }
        }

    }
}