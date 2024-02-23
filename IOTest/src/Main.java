public class Main {
    public static void main(String[] args) {

        Branch test1 = new testChild();
        Branch test2 = new testChild();

        Branch mid1 = new midChild();
        mid1.addChild(test1);
        mid1.addChild(test2);

        Branch mid2 = new midChild();
        mid2.addChild(test1);
        mid2.addChild(test2);


        Branch test = new TestData();
        test.addChild(mid1);
        test.addChild(mid2);
        test.printData(0);

    }
}