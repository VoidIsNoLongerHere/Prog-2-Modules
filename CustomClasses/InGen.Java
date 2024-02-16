/*
 * This is a custom class written by:
 * Landon Norman
 *
 * You are allowed to use this class as an example or inspiration for your own
 * You are NOT allowed to claim this code as your own unless there is a substantial change or written permission from the author
 *
 * This comment, github commits, and other snippets of code will be used as evidence in the case of academic dishonesty
 */
import java.io.Serializable;
import java.util.Scanner;


//UNTESTED: I have no idea what happens if you pass a type that isnt here, so maybe dont do that
//NOTE: So accoring to my not at all in depth research of the Serializable class. It includes only string and the numbers, so this class should be limited to those classes

public class InGen<T extends Serializable> {
    //NOTE: Scanner must be called outside of this class
    public static InGen<String> in(String prompt, Scanner s){
        System.out.print(prompt);
        return s.nextLine()
    }
    public static InGen<Integer> in(String prompt, Scanner s){
        System.out.print(prompt);
        return Integer.parseInt(s.nextLine());
    }
    public static InGen<Float> in(String prompt, Scanner s){
        System.out.print(prompt);
        return Float.parseFloat(s.nextLine());
    }
    public static InGen<Double> in(String prompt, Scanner s){
        System.out.print(prompt);
        return Double.parseDouble(s.nextLine());
    }
    public static InGen<Long> in(String prompt, Scanner s){
        System.out.print(prompt);
        return Long.parseLong(s.nextLine());
    }
    public static InGen<Boolean> in(String prompt, Scanner s){
        System.out.print(prompt);
        return Boolean.parseBoolean(s.nextLine());
    }

}