public class Drive implements TravelMode{
    @Override
    public Object getETA() {
        System.out.println("Calculating distance (Highway)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating direction (Highway)");
        return 1;
    }
}
