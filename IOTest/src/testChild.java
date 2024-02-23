public class testChild extends Branch {

    private final String item1;
    private final String item2;
    public testChild(){
        item1 = "Something";
        item2 = "something else";
    }

    public void printSelf(int depth) {
        String tabs = getTabs(depth);
        System.out.println(tabs + "Items: ");
        tabs+="\t";
        System.out.println(tabs+"item 1: "+item1);
        System.out.println(tabs+"item 2: "+item2);
    }
}
