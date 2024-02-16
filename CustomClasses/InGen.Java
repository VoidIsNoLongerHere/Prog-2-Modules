/*
 * This is a custom class written by:
 * Landon Norman
 *
 * You are allowed to use this class as an example or inspiration for your own
 * You are NOT allowed to claim this code as your own unless there is a substantial change or written permission from the author
 *
 * This comment, github commits, and other snippets of code will be used as evidence in the case of academic dishonesty
 */
import java.util.Scanner;


//FIXME: I have no idea what happens if you pass a type that isnt here, so maybe dont do that
public class InGen<T> {

    Scanner s = new Scanner(System.in);

    public InGen<String> in(String prompt){
        System.out.print(prompt);
        return s.nextLine()
    }
    public InGen<Integer> in(String prompt){
        System.out.print(prompt);
        return Integer.parseInt(s.nextLine());
    }
    public InGen<Float> in(String prompt){
        System.out.print(prompt);
        return Float.parseFloat(s.nextLine());
    }
    public InGen<Double> in(String prompt){
        System.out.print(prompt);
        return Double.parseDouble(s.nextLine());
    }
    public InGen<Long> in(String prompt){
        System.out.print(prompt);
        return Long.parseLong(s.nextLine());
    }
}