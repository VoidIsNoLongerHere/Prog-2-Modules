public class Main {
    public static void main(String[] args) {

        System.out.println("Walking:");
        var serviceOne = new DirectionService(new Walk());
        serviceOne.getETA();
        serviceOne.getDirection();

        System.out.println("Bus:");
        serviceOne.setTravelMode(new Bus() );
        serviceOne.getETA();
        serviceOne.getDirection();


        System.out.println("Driving:");
        serviceOne.setTravelMode(new Drive() );
        serviceOne.getETA();
        serviceOne.getDirection();


        System.out.println("Bike:");
        serviceOne.setTravelMode(new Bicycle() );
        serviceOne.getETA();
        serviceOne.getDirection();
    }
}