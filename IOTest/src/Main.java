import com.sun.jdi.InvalidTypeException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(InGen.in("Enter a string: ", String.class) instanceof String);
        System.out.println(InGen.in("Enter a Integer: ", Integer.class) instanceof Integer);
        System.out.println(InGen.in("Enter a Float: ", Float.class) instanceof Float);
        System.out.println(InGen.in("Enter a Double: ", Double.class) instanceof Double);
        System.out.println(InGen.in("Enter a Boolean: ", Boolean.class) instanceof Boolean);



    }
}