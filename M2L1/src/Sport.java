import java.text.NumberFormat;


public class Sport {
//init
    private int wins;
    private int losses;
    private String name;
    private int players;

//constructor
    public Sport(){
        wins = 0;
        losses = 0;
        players = 0;
        name = "";
    }
     public Sport(String name, int players ,int wins, int losses){
         this.wins = wins;
         this.losses = losses;
         this.players = players;
         this.name = name;
     }

     //funcs
     public void winLoss(){
         NumberFormat n = NumberFormat.getPercentInstance();
         int total = wins+losses;
         double winP = (double) wins / total;
         double lossP = (double) losses / total;


         System.out.println("The win percentage of " + name + " is: " + n.format(winP));
         System.out.println("The loss percentage of " + name + " is: " + n.format(lossP));
         return;
     }

    public int getWins() {return wins;}
    public void setWins(int wins) {this.wins = wins;}
    public int getLosses() {return losses;}
    public void setLosses(int losses) {this.losses = losses;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getPlayers() {return players;}
    public void setPlayers(int players) {this.players = players;}


}
