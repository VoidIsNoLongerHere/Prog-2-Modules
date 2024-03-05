import com.sun.jdi.InvalidTypeException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println(InGen.in("Enter a string: ", String.class));
//        System.out.println(InGen.in("Enter a Integer: ", Integer.class));
//        System.out.println(InGen.in("Enter a Float: ", Float.class));
//        System.out.println(InGen.in("Enter a Double: ", Double.class));
//        System.out.println(InGen.in("Enter a Boolean: ", Boolean.class));


        Tree test = new Tree();

        dummy one = new dummy();
        dummy two = new dummy();
        dummy three = new dummy();
        dummy four = new dummy();
        dummy five = new dummy();
        dummy six = new dummy();
        dummy seven = new dummy();
        dummy eight = new dummy();

        one.addChild(three);
        two.addChild(four);

        three.addChild(five);
        four.addChild(six);

        five.addChild(seven);
        six.addChild(eight);

        test.add(one);
        test.add(two);


        test.print();



    }
}