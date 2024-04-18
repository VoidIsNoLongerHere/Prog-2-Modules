public abstract class Character {
    //Ints
    String name;
    Double health;
    int level;
    Character target;

    //constructor


    public Character(String name, int level) {
        this.name = name;
        this.health = 100d;
        this.level = level;
    }


    //methods
    public void attack(){
        System.out.println("Character is Attacking!");
    }
    public void defend(Character attacker){
        System.out.println("Character is Defending!");

    }


    //get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Character getTarget() {
        return target;
    }

    public void setTarget(Character target) {
        this.target = target;
    }
}

