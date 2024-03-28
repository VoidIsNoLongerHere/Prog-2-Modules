import java.text.NumberFormat;

public class Nurse extends MedicalProvider{
    //Var
    private String type;
    private double rate;
    private double hours;


    //Constructors
    public Nurse() {}

    public Nurse(String firstName, String lastName, String employeeID, OfficeLocation office, String type, double rate, double hours) {
        super(firstName, lastName, employeeID, office);
        this.type = type;
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public void printInfo() {
        NumberFormat c = NumberFormat.getCurrencyInstance();
        super.printInfo();
        System.out.printf("Type: %s\n", type);
        System.out.printf("Hourly Rate: %s/h\n\n", c.format(rate));
    }

    //Get/Sets

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
