public class Main {
    public static void main(String[] args) {
        //Init
        IOSimplfier i = new IOSimplfier();

        Character c = new Character(
                i.inStr("Please enter the main character's name: "),
                i.inStr("Please enter the main character's type: "),
                i.inInt("Please enter the main character's HP: ")
        );
        VideoGame v = new VideoGame(
                i.inStr("Please enter the video game's name: "),
                i.inStr("Please enter the video game's genre: "),
                c
        );
        GameStudio studio = new GameStudio(
                i.inStr("Please enter the studio name: "),
                i.inStr("Please enter its location: "),
                v
        );
        studio.print();




    }
}