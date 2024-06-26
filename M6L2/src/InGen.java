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

public class InGen {
    /**
     * Used in lieu of scanner class, makes it easier and less annoying
     *
     *
     * @param prompt Prompt to print into console before prompting for input
     * @param type Type of data to return (String.class, Integer.class)
     * @return Type Specified in param Type
     *
     */
    public static<T> T in(String prompt, Class<T> type ){


        //Prompt the user

        System.out.print(prompt);


        Scanner s = new Scanner(System.in);
        String response = s.nextLine();
        s = null;
        T value;

        System.gc();

        //Identify Type then return it
        try {
            if (type == Integer.class) {
                value = (T) Integer.valueOf(response);
            } else if (type == Long.class) {
                value = (T) Long.valueOf(response);
            } else if (type == Float.class) {
                value = (T) Float.valueOf(response);
            } else if (type == Double.class) {
                value = (T) Double.valueOf(response);
            } else if (type == Boolean.class) {
                value = (T) Boolean.valueOf(response);
            } else if (type == String.class) {
                value = (T) response;
            } else {
                throw new IllegalArgumentException("Code Error!!, invalid type passed as parameter");
            }

            return value; // Catch-all return statement

        } catch (NumberFormatException e) {

            System.out.println("Invalid Input");
            value = in(prompt, type);
            return value;

        } catch (Exception e){
            throw new RuntimeException(e);
        }


    }
}
