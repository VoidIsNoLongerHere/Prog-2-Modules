public class Warrior extends Character implements SpecialAbility{
    private int strength;
    public Warrior(String name, int level, int strength) {
        super(name, level);
        this.strength = strength;
    }

    @Override
    public void attack() {
        System.out.printf("%s swung at %s!\n", name, target.getName());
        target.defend(this);
    }

    @Override
    public void defend(Character attacker) {
        System.out.printf("%s blocked %s!\n", name, attacker.getName());
        health -= 1;
    }

    @Override
    public void useAbility() {
        System.out.printf("%s entered a Rage!", name);
        strength += 1;
    }
}
