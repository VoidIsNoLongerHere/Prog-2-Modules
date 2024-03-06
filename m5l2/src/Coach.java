public class Coach extends TeamMember implements Leaflet{
    private String role;

    public Coach(String name, int jerseyNumber, String role) {
        super(name, jerseyNumber);
        this.role = role;
    }

    @Override
    public void printSelf(int depth) {
        System.out.println(tabs(depth++) + "Coach:");
        System.out.println(tabs(depth) + "Name: " + super.name);
        System.out.println(tabs(depth) + "Jersey Number: " + super.jerseyNumber);
        System.out.println(tabs(depth) + "Role: " + role);
    }
}
