import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Leaflet  {

    /**
     * Print data from self, then print children recursively. Depth is the amount of indentation.
     *
     * @param depth Tabs before the data printed. Should ideally never be set manually
     */
    void printSelf(int depth);

    /**
     * Generates a string of "\t"
     * @param depth Integer amount of tabs
     * @return A string of "\t" characters
     */
    default String tabs(int depth){
        if (depth > 0){return "\t".repeat(depth);}
        return "";
    }

    /**
     * Adds a Leaflet object to the child list attribute
     * @param child Implemented Leaflet object
     */
    void addChild(Leaflet child);

    /**
     * Print children from self, this should never be called manually
     * @param depth Tabs before data is printed,
     */
    void printChildren(int depth);

}
