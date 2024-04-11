public abstract class Character {
    //Ints
    String name;
    Double health;
    int level;

    //constructor


    public Character(String name, int level) {
        this.name = name;
        this.health = 100d;
        this.level = level;
    }

    public Character() {
    }

    //methods
    public int attack(Character target){
        int damage = 10;
        int targetLevel = target.getLevel();
        if ( targetLevel > this.level){
            //Ifover 10 set to 0
        }
    }
    public int defend(Character enemy){
        int damage = enemy.attack(this);

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
}

