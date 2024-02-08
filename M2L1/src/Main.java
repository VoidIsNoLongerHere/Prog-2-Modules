// Landon Norman
// Module 2 Lab 1
// 1/30/2024
// Purpose: Create Sports Class

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//init var
        Scanner s = new Scanner(System.in);
        int win, loss, players;
        String name;
//in
        System.out.print("Please Enter the team's name: ");
        name = s.next();

        System.out.print("Please Enter the team's players: ");
        players = s.nextInt();

        System.out.print("Please Enter the team's wins: ");
        win = s.nextInt();

        System.out.print("Please Enter the team's losses: ");
        loss = s.nextInt();

        Sport game = new Sport(name, players, win, loss);

//out
        System.out.println("Stats of "+ game.getName()+":");
        System.out.println(game.getPlayers() + " Players");
        System.out.println(game.getWins()+ " Wins" );
        System.out.println(game.getLosses()+" Losses");
        game.winLoss();
    }
}