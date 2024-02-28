public class Car {
    private String brand;
    private String model;
    private int year;
    private double mileage;


    public Car(){
        //var
        String brand="";
        String model="";
        int year=0;
        double mileage=0;
    }

    //constructor
    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        stats();
    }


    //funcs
    private void stats() {
        System.out.println("Stats of your car:");
        System.out.println("Year: "+ this.year);
        System.out.println("Model: "+ this.model);
        System.out.println("Brand: "+this.brand);
        System.out.println("Miles: "+this.mileage);
    }

    public double drive(double miles){
        this.mileage += miles;
        System.out.println("The mileage is now "+this.mileage+" miles.");
        return miles;
    }

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public double getMileage() {return mileage;}
    public void setMileage(double mileage) {this.mileage = mileage;}







}
