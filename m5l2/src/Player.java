public class Player extends TeamMember implements Leaflet{
    private String position;


    public Player(String name, int jerseyNumber, String position) {
        super(name, jerseyNumber);
        this.position = position;
    }

    @Override
    public void printSelf(int depth) {
        System.out.println(tabs(depth++) + "Player:");
        System.out.println(tabs(depth) + "Name: " + super.name);
        System.out.println(tabs(depth) + "Jersey Number: " + super.jerseyNumber);
        System.out.println(tabs(depth) + "Position: " + position);
    }
}
