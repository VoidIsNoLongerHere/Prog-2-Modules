public class TeamMember implements Leaflet{

    protected String name;
    protected int jerseyNumber;


    public TeamMember(String name, int jerseyNumber){
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }


    @Override
    public void printSelf(int depth) {

        System.out.println(tabs(depth++) + "Member:");
        System.out.println(tabs(depth) + "Name: " + name);
        System.out.println(tabs(depth) + "Jersey Number: " + jerseyNumber);
    }

    @Override
    public void addChild(Leaflet child) {}

    @Override
    public void printChildren(int depth) {}



}
