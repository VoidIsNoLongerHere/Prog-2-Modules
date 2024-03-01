import java.util.Random;
public class dummy implements Leaflet{

    public dummy() {
        System.out.println("New child created");
    }

    public void printSelf(int depth) {
        System.out.println(getTabs(depth) + "dummy #"+ depth);
        System.out.println(getTabs(depth+1) + "dummy" + depth + "=" + ++depth);
    }
}
