// Landon Norman
// Module 5 CLO 8
// 3/5/2024
// Purpose: Polymorphism

public class Main {
    public static void main(String[] args) {

        Animal[] pets = new Animal[4];

        pets[0] = new Dog("Doggy");
        pets[1] = new Cat("Mr. Whiskers");
        pets[2] = new Dog("An original name");
        pets[3] = new Cat("Mr. Meow");

        Dog singleDog = new Dog("Big Woofy");
        System.out.println(singleDog.getName()+": ");
        singleDog.makeSound();

        Cat singleCat = new Cat("Big fluff");
        System.out.println(singleCat.getName()+": ");
        singleCat.makeSound();

        System.out.println("\n\nAnimal Sounds:");
        for (Animal animal : pets) {
            System.out.println(animal.getName() + ": ");
            animal.makeSound();
        }
    }
}
