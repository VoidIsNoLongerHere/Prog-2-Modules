// Landon Norman
// Module 2 Lab 4
// 2/1/2024
// Purpose: self contained bank acc class

import java.util.Objects;
import java.util.Random;
import java.text.NumberFormat;
import java.util.Scanner;
public class BankAccount {
    //init
    Random r = new Random();
    NumberFormat d = NumberFormat.getCurrencyInstance();
    Scanner s = new Scanner(System.in);


    //var
    int accountNum;
    String name, type;
    String transactions;
    double balance;

    //Constructor
    public BankAccount(String name, String type, double balance) {
        this.name = name;
        this.type = type;
        this.transactions = "";
        this.accountNum= r.nextInt(10000000,99999999);
        this.balance = balance;
        stats();
        teller();
    }

    public BankAccount() {
        this.name = "";
        this.type = "";
        this.transactions = "";
        this.accountNum= r.nextInt(10000000,99999999);
        this.balance = 0;
    }

    //Methods

    public void stats(){
        System.out.println("Account Owner: " + name);
        System.out.println("Account Number: " + accountNum);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + d.format(balance));
        System.out.println("Transaction History: " + transactions);
    }

    public void teller(){
        label:
        while (true) {
            System.out.println("Would you like to:\n(1): Deposit\n(2): Withdraw\n(3): Account Details \nAny other input will exit: ");
            String choice = s.next();
            switch (choice) {
                case "1":
                    System.out.print("How much would you like to deposit?: $");
                    deposit(s.nextDouble());
                    continue;
                case "2":
                    System.out.print("How much would you like to withdraw?: $");
                    withdraw(s.nextDouble());
                    continue;
                case "3":
                    stats();
                    break;
                case null:
                default:
                    break label;
            }
        }
    }

    private void deposit(double amount){
        String entry = "\n-- Deposit of " + d.format(amount);
        this.transactions = this.transactions+entry;
        this.balance += amount;
    }

    private void withdraw(double amount){
        String entry = "\n-- Withdraw of " + d.format(amount);
        this.transactions = this.transactions+entry;
        this.balance -= amount;
    }

    //get/set
    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransactions() {
        return transactions;
    }

    public void addTransaction(String transaction) {
        this.transactions += transaction;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
