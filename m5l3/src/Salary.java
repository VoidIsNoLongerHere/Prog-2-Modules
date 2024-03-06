import java.text.NumberFormat;

public class Salary extends Employee implements Leaflet{

    private double payRate;
    private double monthlyBonus;

    public Salary(String employeeID, String fName, String lName, double payRate, double monthlyBonus ,Benefit employeeBenefit, Address employeeAddress) {
        super(employeeID, fName, lName, employeeBenefit, employeeAddress);
        this.payRate = payRate;
        this.monthlyBonus = monthlyBonus;
    }

    @Override
    public void printSelf(int depth) {
        NumberFormat c = NumberFormat.getCurrencyInstance();
        super.printSelf(depth);
        System.out.println(tabs(++depth)+ "Salary: " + c.format(payRate));
        System.out.println(tabs(depth)+ "Monthly Bonus: " + c.format(monthlyBonus));
        System.out.println(tabs(depth)+ "Next Pay: " + c.format(calcPay()));
    }

    public double calcPay(){
        return (payRate/24);
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }
}
