import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Leaflet  {
    void printSelf(int depth); // Required to printchild as well if able
    default String tabs(int depth){
        return "\t".repeat(depth);
    }
    void addChild(Leaflet child);

    void printChildren(int depth);

}
