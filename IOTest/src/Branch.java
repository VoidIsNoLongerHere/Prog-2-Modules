public abstract class Branch {

    //Variables
    private Branch parent;
    private Branch[] children;
    protected int depth;

    //Constructors
    public Branch(Branch[] children){
        this.parent = null;
        this.depth = 0;
        this.children = children;
    }

    public Branch(Branch parent, Branch[] children){
        this.parent = parent;
        this.depth = parent.depth+1; // Increase depth counter
        this.children = children;
    }

    // Identifiers
    private boolean hasChildren(){
        return (children.length) > 0;
    }
    private boolean hasParent(){
        return parent != null;
    }

    //Output

    public abstract void printData();


}
