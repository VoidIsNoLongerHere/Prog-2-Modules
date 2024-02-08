// Landon Norman
// Module 2 Lab 4
// 2/1/2024
// Purpose: Create bank anccoun


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // init
        Scanner s = new Scanner(System.in);

        // Vars
        String name, type;
        double balance;

        //Input
        System.out.print("Please enter your name: ");
        name = s.nextLine();

        System.out.print("Please enter the account type (Checking or Savings): ");
        type = s.next();

        System.out.print("Please enter the balance: $");
        balance = s.nextDouble();

        //Class call
        BankAccount acc1 = new BankAccount(name, type, balance);
    }
}