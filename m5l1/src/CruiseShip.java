public class CruiseShip extends Ship{

    private int maxPassengers;
    public CruiseShip(String name, int year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }
    //method


    @Override
    public String toString() {
        return "CruiseShip{" +
                "name='" + super.getName() + '\'' +
                ", year=" + super.getYear() +
                ", maxPassengers=" + maxPassengers +
                '}';
    }

    //Get/set
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
