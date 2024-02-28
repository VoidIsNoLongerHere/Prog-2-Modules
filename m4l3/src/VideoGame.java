import java.text.NumberFormat;

public class VideoGame {
    //Attrib
    private final String title;
    private final String genre;
    private final String platform;
    private final Double price;

    //Constructor
    public VideoGame(String title, String genre, String platform, Double price) {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.price = price;
    }

    //Method
    public void print(){
        NumberFormat c = NumberFormat.getCurrencyInstance();
        System.out.printf("%s:\n", title);
        System.out.printf("\tGenre: %s\n", genre);
        System.out.printf("\tPlatform: %s\n", platform);
        System.out.printf("\tPrice: %s\n", c.format(price));
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatform() {
        return platform;
    }

    public Double getPrice() {
        return price;
    }
}
