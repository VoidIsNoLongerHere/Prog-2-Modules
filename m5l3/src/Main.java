// Landon Norman
// Module 5 Lab 3
// 3/5/2024
// Purpose: Demonstrate much more polymorphism

public class Main {
    public static void main(String[] args) {
        //Init the list
        Tree workers = new Tree();


        //Be lazy and make generic stuff
        Address genericAdd = new Address("123 example lane", "city", "state", "123456");
        Benefit genericBen = new Benefit(123.45f, "Insurance", "Corporation");

        //Create the workers
        workers.add(new Hourly(
                "12345678",
                "Steve",
                "Stevenson",
                15.50,
                50,
                new Benefit(genericBen),
                new Address(genericAdd)
        ));
        workers.add(new Hourly(
                "65348756",
                "Stevey",
                "Ranch",
                16.43,
                40,
                new Benefit(genericBen),
                new Address(genericAdd)
        ));

        workers.add(new Salary(
                "94345678",
                "Bill",
                "Burbonson",
                123456,
                5000,
                new Benefit(genericBen),
                new Address(genericAdd)
        ));
        workers.add(new Salary(
                "8532095820",
                "Billy",
                "Burbonsons",
                12345678,
                50000,
                new Benefit(genericBen),
                new Address(genericAdd)
        ));


        workers.print();
    }
}