// Landon Norman
// 1/30/2024

import java.text.NumberFormat;

public class House {

    // vars
    private String address;
    private int sqFeet, numBed;
    private double numBath, price;
    private final NumberFormat d = NumberFormat.getCurrencyInstance();

    //constructors
    public House(String address, int sqFeet, int numBed, double numBath, double price) {
        this.address = address;
        this.sqFeet = sqFeet;
        this.numBed = numBed;
        this.numBath = numBath;
        this.price = price;
        stats();
    }
    public House(){
        this.address = "";
        this.sqFeet = 0;
        this.numBed = 0;
        this.numBath = 0.0;
        this.price = 0.0;
    }

    //methods
    public String pricePerSqFoot(){
        return d.format(price/sqFeet);
    }
    public void stats(){
        System.out.println(address+":");
        System.out.println("----------------");
        System.out.println("Sq Ft: " + sqFeet);
        System.out.println("Bedrooms: " + numBed);
        System.out.println("Bathrooms: " + numBath);
        System.out.println("Price: " + d.format(price));
        System.out.println("$/SqFt:  " + pricePerSqFoot());
        return;
    }

    //get/Set
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSqFeet() {
        return sqFeet;
    }
    public void setSqFeet(int sqFeet) {
        this.sqFeet = sqFeet;
    }
    public int getNumBed() {
        return numBed;
    }
    public void setNumBed(int numBed) {
        this.numBed = numBed;
    }
    public double getNumBath() {
        return numBath;
    }
    public void setNumBath(double numBath) {
        this.numBath = numBath;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
