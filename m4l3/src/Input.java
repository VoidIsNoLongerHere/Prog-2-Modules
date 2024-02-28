/*
 * This is a custom class written by:
 * Landon Norman
 *
 * You are allowed to use this class as an example or inspiration for your own
 * You are NOT allowed to claim this code as your own unless there is a substantial change or written permission from the author
 *
 * This comment, github commits, and other snippets of code will be used as evidence in the case of academic dishonesty
 */

import java.util.Objects;
import java.util.Scanner;

public class Input {

    public static Object in(String prompt, String type){
        /*
        * This is used in lieu of the scanner class because I hate it
        * ARG 1 = String : Prompt to the cli
        * ARG 2 = String : Type to be read from cli:
        *
        * */

        //Prompt the user

        System.out.print(prompt);

        type = type.toLowerCase();
        Scanner s = new Scanner(System.in);
        String response = s.nextLine();
        s = null;

        //Identify Type then return it
        switch (type) {
            case "i", "int", "integer" ->{
                return Integer.parseInt(response);
            }
            case "l", "long" ->{
                return Long.parseLong(response);
            }
            case "f", "float" ->{
                return Float.parseFloat(response);
            }
            case "d", "double" ->{
                return Double.parseDouble(response);
            }
            case "b", "bool", "boolean" ->{
                return Boolean.parseBoolean(response);
            }
            case null, default -> {
                return response;
            }

        }}
    public static String in(String prompt){
            /*
             * This is used in lieu of the scanner class because I hate it
             * ARG 1 = String : Prompt to the cli
             */

            //Prompt the user
            System.out.print(prompt);

            //Get and return input
            Scanner s = new Scanner(System.in);
            return s.nextLine();

    }


}
