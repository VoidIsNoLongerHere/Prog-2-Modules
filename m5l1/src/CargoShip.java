public class CargoShip extends Ship{
    //Var
    private int weight;

    //Constructor
    public CargoShip(String name, int year, int tons) {
        super(name, year);
        this.weight = tons;
    }

    //Methods
    @Override
    public String toString() {
        return "CargoShip{" +
                "weight=" + weight +
                ", name='" + super.getName() + "'" +
                ", year=" + super.getYear() +
                '}';
    }

    //Get/Set
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
