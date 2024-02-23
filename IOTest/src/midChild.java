public class midChild extends Branch {
    private final String item;


    public midChild() {
        this.item = "Stuff";
    }

    public void printSelf(int depth){
        System.out.println(getTabs(depth)+"Things:");
        System.out.println(getTabs(depth)+"\tItem: " + item);

    }
}
