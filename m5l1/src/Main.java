// Landon Norman
// Module 5 Lab 1
// 2/29/2024
// Purpose: Extend classes and cargoships man
public class Main {
    public static void main(String[] args){
        Ship cargo = new CargoShip(
                InGen.in("Please enter the name of the cargo ship: ", String.class),
                InGen.in("Please enter the year it was built: ", Integer.class),
                InGen.in("Please enter the weight in tons: ", Integer.class)
                );

        Ship cruise = new CruiseShip(
                InGen.in("Please enter the name of the cruise ship: ", String.class),
                InGen.in("Please enter the year it was built: ", Integer.class),
                InGen.in("Please enter the maximum about of passengers: ", Integer.class)
        );

        System.out.println(cargo.toString());
        System.out.println(cruise.toString());
    }
}