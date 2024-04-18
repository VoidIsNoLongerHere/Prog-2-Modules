public class Mage extends Character implements SpecialAbility{
    private int power;
    public Mage(String name, int level, int power) {
        super(name,level);
        this.power = power;
    }

    @Override
    public void attack() {
        System.out.printf("%s cast fireball on %s!\n", name, target.getName());
        target.defend(this);
    }

    @Override
    public void defend(Character attacker) {
        System.out.printf("%s used magic to block %s's attack!\n", name, attacker.getName());
        health -= 1;
    }

    @Override
    public void useAbility() {
        System.out.printf("%s used time warp!\n", name);
        health = 10d;
    }
}
