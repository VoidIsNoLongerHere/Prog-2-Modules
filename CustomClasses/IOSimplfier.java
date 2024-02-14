import java.util.Scanner;

public class IOSimplfier {
    Scanner s = new Scanner(System.in);
    
    public String inStr(String prompt){
        System.out.print(prompt);
        return s.nextLine();
    }
    public int inInt(String prompt){
        System.out.print(prompt);
        return s.nextInt();
    }
    public float inFloat(String prompt){
        System.out.print(prompt);
        return s.nextFloat();
    }
    public double inDouble(String prompt){
        System.out.print(prompt);
        return s.nextDouble();
    }
    public long inLong(String prompt){
        System.out.print(prompt);
        return s.nextLong();
    }
}
