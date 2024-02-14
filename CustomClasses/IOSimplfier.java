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


/*
* This entire class is equal to
*
* System.out.print(prompt);
  return s.nextLine();

* Major changes not needed as its just that
*/
public class IOSimplfier {
    private Scanner s = new Scanner(System.in);
    
    public String inStr(String prompt){
        System.out.print(prompt);
        return s.nextLine();
    }
    public Integer inInt(String prompt){
        System.out.print(prompt);
        return Integer.parseInt(s.nextLine());
    }
    public Float inFloat(String prompt){
        System.out.print(prompt);
        return Float.parseFloat(s.nextLine());
    }
    public Double inDouble(String prompt){
        System.out.print(prompt);
        return Double.parseDouble(s.nextLine());
    }
    public Long inLong(String prompt){
        System.out.print(prompt);
        return Long.parseLong(s.nextLine());
    }
}
