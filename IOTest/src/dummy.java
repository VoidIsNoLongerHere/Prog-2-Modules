import java.util.ArrayList;

public class dummy implements Leaflet{

    public dummy() {
        System.out.println("New child created");
    }
    ArrayList<Leaflet> children = new ArrayList<>();

    public void printSelf(int depth) {
        System.out.println(tabs(depth) + "dummy #"+ depth);
        System.out.println(tabs(depth+1) + "Data #:" + depth + "=" + ++depth);
        printChildren(depth);
    }

    @Override
    public void addChild(Leaflet child) {
        children.add(child);
    }

    public void printChildren(int depth){
        for (Leaflet child: children){
            child.printSelf(depth);
        }
    }


}
