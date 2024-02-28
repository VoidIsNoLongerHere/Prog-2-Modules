import java.util.ArrayList;

// Landon Norman
// Module 4 Lab 3
// 2/27/2024
// Purpose: Video game library
public class Main {
    public static void main(String[] args) {
        ArrayList<VideoGame> library = new ArrayList<>(); //Create the array
        boolean iterate = true;

        while (iterate){
            prompt();
            iterate = menu((Integer)Input.in("Please enter your choice: ", "i"), library); //Keep going until exit
        }

    }


    public static void prompt(){
        System.out.println("1: Add Game\n2: Display Inventory\n3: Search by Title\n4: Search by platform\n0: Exit");
    }
    public static boolean menu(Integer choice, ArrayList<VideoGame> library){
        return switch (choice) {
            case 1 -> {
                addGame(library);
                yield true;
            }
            case 2 -> {
                displayInventory(library);
                yield true;
            }
            case 3 -> {
                searchTitle(library);
                yield true;
            }
            case 4 -> {
                searchPlatform(library);
                yield true;
            }
            case 0 -> false;
            default -> {
                prompt();
                yield menu((Integer) Input.in("Please enter your choice: ", "i"), library);
            }
        };
    }
    public static void addGame(ArrayList<VideoGame> library){

        library.add(new VideoGame(
                Input.in("Enter the title: "),
                Input.in("Enter the Genre: "),
                Input.in("Enter the platform: "),
                (Double) Input.in("Enter the price: $", "d") // I guess i cant overload the functions without casting it
                ));

    }
    public static void displayInventory(ArrayList<VideoGame> library){
        for (VideoGame game : library){
            game.print();
        }
    }
    public static void searchTitle( ArrayList<VideoGame> library){
        String search = Input.in("Enter the title you're searching for: ");
        for (VideoGame game :library){
            if (game.getTitle().equalsIgnoreCase(search)){
                game.print();
            }
        }
    }
    public static void searchPlatform(ArrayList<VideoGame> library){
        String search = Input.in("Enter the platform you're searching for: ");

        for (VideoGame game :library){
            if (game.getPlatform().equalsIgnoreCase(search)){
                game.print();
            }

        }
    }
}