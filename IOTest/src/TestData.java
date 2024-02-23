public class TestData extends Branch{

    private final String title;

    public TestData(){
        title = Input.in("Enter the category: ");
    }


    public void printSelf(int depth){
        System.out.println(getTabs(depth) + title + ": ");
    }



    public void initData(){
        int amount = (int) Input.in("How many items?: ", "i");
        for (int i = 0; i <= amount; i++){
            this.addChild(new testChild());
        }
    }
}
