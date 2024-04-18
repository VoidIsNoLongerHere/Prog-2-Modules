public class Bicycle implements TravelMode{
    @Override
    public Object getETA() {
        System.out.println("Calculating distance (Bike)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating direction (Bike)");
        return 2;
}
