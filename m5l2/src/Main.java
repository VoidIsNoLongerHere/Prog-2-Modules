// Landon Norman
// Module 5 Lab 2
// 3/5/2024
// Purpose: demonstrate polymorphism

public class Main {
    public static void main(String[] args) {
        Tree team = new Tree(); // All implement leaflet

        int coaches = InGen.in("Please enter the amount of coaches: ", Integer.class);
        int players = InGen.in("Please enter the amount of players: ", Integer.class);

        for (int i = 0; i < coaches; i++){
            int realNumber = i+1;
            team.add(new Coach(
                    InGen.in("Please enter Coach #" +realNumber+ "'s name:", String.class),
                    InGen.in("Please enter Coach #" +realNumber+ "'s jersey number:", Integer.class),
                    InGen.in("Please enter Coach #" +realNumber+ "'s role:", String.class)
            ));
        }

        for (int i = 0; i < players; i++){
            int realNumber = i+1;
            team.add(new Player(
                    InGen.in("Please enter Player #" +realNumber+ "'s name:", String.class),
                    InGen.in("Please enter Player #" +realNumber+ "'s jersey number:", Integer.class),
                    InGen.in("Please enter Player #" +realNumber+ "'s position:", String.class)
            ));
        }

        team.print();



    }
}