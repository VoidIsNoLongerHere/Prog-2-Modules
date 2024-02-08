import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //init
        Scanner s = new Scanner(System.in);

        //var
        int year;
        double mileage;
        String brand, model;

        //input
        System.out.print("Please enter the brand: ");
        brand = s.next();

        System.out.print("\nPlease enter the model: ");
        model = s.next();

        System.out.print("\nPlease enter the year: ");
        year = s.nextInt();

        System.out.print("\nPlease enter the mileage: ");
        mileage = s.nextDouble();


        //logic
        Car v = new Car(brand, model, year, mileage);

        boolean driving = true;
        while (driving){
            System.out.println("How far would you like to drive? (Enter 0 to stop)");

            if (v.drive(s.nextDouble())>0){
                continue;
            } else {
                driving = false;
                System.out.println("You have driven "+v.getMileage()+" Miles.");
            }
        }

    }
}