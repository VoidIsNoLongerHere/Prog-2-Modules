import java.util.ArrayList;

public class Tree{
    ArrayList<Leaflet> roots = new ArrayList<>();

    public Tree(){};

    public void print(){
        for (Leaflet root: roots){
            root.printSelf(0);
            System.out.println();
        }
    }
    public void add(Leaflet root){
        roots.add(root);
    }

}