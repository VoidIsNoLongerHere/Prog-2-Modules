
// Landon Norman
// Module 4 Lab 1
// 2/26/2024
// Purpose: Display arraylist of car objects

import java.util.ArrayList;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> carLot = new ArrayList<Car>();

        carLot.add( new Car("Ford", "F150", 2019, 12045.35));
        carLot.add( new Car("Toyota", "Corolla", 2019, 1204.21));
        carLot.add( new Car("Kawasaki", "Ninja 450", 2019, 5000.35));
        carLot.add( new Car("Ford", "Mustang", 2019, 12045.35));
        carLot.add( new Car("Ford", "Mustang", 2022, 32055.86));

        printLot(carLot);
    }

    public static void printLot(ArrayList<Car> lot){
        NumberFormat c = NumberFormat.getCurrencyInstance();
        double total = 0;
        for (Car car: lot){
            System.out.println(car.make+": ");
            System.out.println("\tModel: "+car.model);
            System.out.println("\tYear: " + car.year);
            System.out.println("\tPrice: "+ c.format(car.price));
            total += car.price;
        }
        System.out.println("\nTotal Value: "+ c.format(total));
    }
}