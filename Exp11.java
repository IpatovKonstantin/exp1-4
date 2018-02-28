import java.util.Scanner;

public class Exp11 {
    public static void main(String args[]) {
        int a=38;
        int b=40;
        double r= (Math.random()+1)*((b-a)/2);
        System.out.println((int) Math.round(r+a));
    }
}
