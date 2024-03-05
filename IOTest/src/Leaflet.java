import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Leaflet  {
//    default void addAsRoot(ArrayList<Object> tree){
//        tree.addAll()
//    }
    void addChild(Object child); //Adds a child to arraylist of children
    ArrayList<Object> getChildren(); // Returns an arraylist of children
    Boolean hasChild(); // Returns true if there are children in the array
    default void addToRoot(Tree tree){
        Pair<Object, ArrayList<Object> > branch = new Pair<>(this, this.getChildren());
        tree.addToRoot(branch);
    }
    void printSelf();

}
