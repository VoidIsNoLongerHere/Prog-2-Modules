public class Character {
    //Var
    private String name, type;
    private int hitPoints;

    //Constructor


    public Character(String name, String type, int hitPoints) {
        this.name = name;
        this.type = type;
        this.hitPoints = hitPoints;
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
