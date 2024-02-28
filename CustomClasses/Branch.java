/*
 * This is a custom class written by:
 * Landon Norman
 *
 * You are allowed to use this class as an example or inspiration for your own
 * You are NOT allowed to claim this code as your own unless there is a substantial change or written permission from the author
 *
 * This comment, github commits, and other snippets of code will be used as evidence in the case of academic dishonesty
 */

public abstract class Branch {

    //Variables
    protected Branch[] children = {};

    //Constructors
    public Branch (){
        this.children = null;
    }


    //Methods
    public void addChild(Branch child){
        if (this.children == null){
            this.children = new Branch[1];
            this.children[0] = child;
            return;
        }
        int len = this.children.length;
        Branch[] newChildren = new Branch[len+1];

        System.arraycopy(this.children, 0, newChildren, 0, len);
        newChildren[len] = child;

        this.children = newChildren;
    }

    protected String getTabs(int depth){
        return "\t".repeat(Math.max(0, depth));
    }
    abstract void printSelf(int depth);

    public void printChildren(int depthPlusOne){
        if (hasChildren()){
            for (Branch child:children){
                child.printData(depthPlusOne);
            }
        }

    }

    // Identifiers
    private boolean hasChildren(){
        return children != null && (children.length) != 0;
    }

    //Output

    public void printData(int depth){
        printSelf(depth);
        printChildren(depth+1);
    }


}
