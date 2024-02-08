//Landon Norman
// M1L2
//1/18/24
//Purpose: Make A cash register
// I might know some java already
// I am also really good at reading documentation

import java.util.Scanner;
import java.text.NumberFormat;

public class CashRegister {
    public static int getBills(String denomination) {
        System.out.print("How many " + denomination + "?: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    public static double getCoins(String denomination) {
        System.out.print("How many " + denomination + "?: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();
    }


    public static void main(String[] args) {
        // Init Vars
        NumberFormat mFmt = NumberFormat.getCurrencyInstance();

        int twenty = getBills("$20s"),
                ten = getBills("$10s"),
                five = getBills("$5s"),
                one = getBills("$1s");
        double
                quarter = getCoins("quarters"),
                dime = getCoins("dimes"),
                nickel = getCoins("nickels"),
                penny = getCoins("pennies");

        // Logic

        System.out.print("There is $" + (twenty * 20) + ".00 worth of twenties. \n");
        System.out.print("There is $" + (ten * 10) + ".00 worth of tens. \n");
        System.out.print("There is $" + (five * 5) + ".00 worth of fives. \n");
        System.out.print("There is $" + (one) + ".00 worth of ones. \n");
        System.out.print("There is " + mFmt.format(quarter * .25) + " worth of quarters. \n");
        System.out.print("There is " + mFmt.format(dime * .1) + " worth of dimes. \n");
        System.out.print("There is " + mFmt.format(nickel * .05) + " worth of nickels. \n");
        System.out.print("There is " + mFmt.format(penny * .01) + " worth of pennies. \n");


        double total = twenty * 20 + five * 5 + ten * 10 + one + quarter * 0.25 + dime * 0.1 + nickel * .05 + penny * 0.01;

        System.out.print("There is " + mFmt.format(total) + " total.");


    }


}