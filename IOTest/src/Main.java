import com.sun.jdi.InvalidTypeException;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println(InGen.in("Enter a string: ", String.class));
//        System.out.println(InGen.in("Enter a Integer: ", Integer.class));
//        System.out.println(InGen.in("Enter a Float: ", Float.class));
//        System.out.println(InGen.in("Enter a Double: ", Double.class));
//        System.out.println(InGen.in("Enter a Boolean: ", Boolean.class));


        dummy one = new dummy();
        dummy two = new dummy();

        one.addChild(two);


        one.print();



    }
}