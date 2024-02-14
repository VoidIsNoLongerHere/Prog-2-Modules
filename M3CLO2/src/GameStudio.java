public class GameStudio {
    //Var
    private String studioName, location;
    private VideoGame publishedGame;

    // Constructor

    public GameStudio(String studioName, String location, VideoGame publishedGame) {
        this.studioName = studioName;
        this.location = location;
        this.publishedGame = publishedGame;
    }
    //Methods
    public void print(){
        //Top Level No Indent
        String tabs = "\n";
        System.out.println("Studio Name: " + studioName);
        System.out.println("Location: " + location);
        System.out.println("Games: \n------------");
        publishedGame.print(tabs);

    }
    //Get/Set

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public VideoGame getPublishedGame() {
        return publishedGame;
    }

    public void setPublishedGame(VideoGame publishedGame) {
        this.publishedGame = publishedGame;
    }
}
