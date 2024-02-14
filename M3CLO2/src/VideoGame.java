public class VideoGame {

    //Var
    String gameName, genre;
    Character mainCharacter;

    //Constructor
    public VideoGame(String gameName, String genre, Character mainCharacter) {
        this.gameName = gameName;
        this.genre = genre;
        this.mainCharacter = mainCharacter;
    }
    //Method
    public void print(String tabs){
        System.out.println(gameName + ": ");
        System.out.println(tabs + "Genre: "+genre);

        tabs += "\n"; // For next details
    }

    // Get/Set

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Character getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(Character mainCharacter) {
        this.mainCharacter = mainCharacter;
    }
}
