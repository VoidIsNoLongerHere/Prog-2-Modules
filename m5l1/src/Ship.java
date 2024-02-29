public class Ship {
    private String name;
    private int year;

    public Ship(String name, int year) {
        this.name = name;
        this.year = year;
    }

    //methods
    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }


    //Get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
