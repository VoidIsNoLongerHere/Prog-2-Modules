import java.util.ArrayList;

public abstract class Leaf {
    abstract void outputData();
    private boolean hasChildren;
    private ArrayList<Object> children;
    public ArrayList<Object> getChildren(){
        return children;
    }

    private void checkChildren(){
        hasChildren = !(children.isEmpty());
    }

    public Leaf (){
        checkChildren();
    }

}
