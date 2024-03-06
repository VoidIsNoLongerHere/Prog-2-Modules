import java.text.NumberFormat;

public class Hourly extends Employee implements Leaflet{

    private double payRate;
    private double hoursWorked;

    public Hourly(String employeeID, String fName, String lName, double payRate ,double hoursWorked ,Benefit employeeBenefit, Address employeeAddress) {
        super(employeeID, fName, lName, employeeBenefit, employeeAddress);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void printSelf(int depth) {
        NumberFormat c = NumberFormat.getCurrencyInstance();
        super.printSelf(depth);
        System.out.println(tabs(depth) + "Pay rate: "+ c.format(payRate));
        System.out.println(tabs(depth) + "Hours worked: " + hoursWorked);
    }

    public double calcPay(){
        double pay = 0;
        if (hoursWorked >40){
            pay = payRate*40;
            pay += (payRate*1.5) * (hoursWorked-40);
        } else {
            pay = payRate*hoursWorked;
        }
        return pay;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
