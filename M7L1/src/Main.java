// Landon Norman
// Module 7 Lab Game Character (1)
// 4/2/2024
// Purpose: interfaces



public class Main {
    public static void main(String[] args) {
        Mage p1 = new Mage("Bob", 30, 10);
        Warrior p2 = new Warrior("Bill", 20, 10);


//It really wasn't specific on what was wanted here
        p1.setTarget(p2);
        p2.setTarget(p1);

        p1.attack();
        p2.attack();

        p1.useAbility();
        p2.useAbility();




    }
}