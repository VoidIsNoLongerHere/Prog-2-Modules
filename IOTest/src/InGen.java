/*
 * This is a custom class written by:
 * Landon Norman
 *
 * You are allowed to use this class as an example or inspiration for your own
 * You are NOT allowed to claim this code as your own unless there is a substantial change or written permission from the author
 *
 * This comment, github commits, and other snippets of code will be used as evidence in the case of academic dishonesty
 */

import com.sun.jdi.InvalidTypeException;
import java.util.Scanner;

public class InGen<T> {
    public static<T> T in(String prompt, Class<T> type ) throws InvalidTypeException {
        /*
         * This is used in lieu of the scanner class because I hate it
         * ARG 1 = String : Prompt to the cli
         * ARG 2 = Class<T> : Type to be cast to from cli:
         *
         * */

        //Prompt the user

        System.out.print(prompt);


        Scanner s = new Scanner(System.in);
        String response = s.nextLine();
        s = null;

        //Identify Type then return it

        if (type == Integer.class){
            return (T) Integer.valueOf(response);
        } else if (type == Long.class) {
            return (T) Long.valueOf(response);
        } else if (type == Float.class) {
            return (T) Float.valueOf(response);
        } else if (type == Double.class) {
            return (T) Double.valueOf(response);
        } else if (type == Boolean.class) {
            return (T) Boolean.valueOf(response);
        } else if (type == String.class){
           return (T) response;
        } else {
            throw new InvalidTypeException();
        }



    }
}
