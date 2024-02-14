public class Character {
    //Var
    private String name, type;
    private Integer hitPoints;

    //Constructor


    public Character(String name, String type, Integer hitPoints) {
        this.name = name;
        this.type = type;
        this.hitPoints = hitPoints;
    }
    //Methods
    public void print(String tabs){
        System.out.println(tabs+"Character:");
        tabs += "\n"; // Add indent for rest of the details

        System.out.println(tabs+ "Name: " + name);
        System.out.println(tabs+ "Type: " + type);
        System.out.println(tabs + "HP: " + hitPoints.toString());
    }
    // Get/Set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
