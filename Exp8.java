import java.util.Scanner;
import java.math.*;
public class Exp8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Boolean t=true;
        int i=1;
        while ((t) && ( i<Math.round(Math.sqrt(n)))){
            i++;
            if ((double) n/i==n/i) {
                t = false;
                System.out.println("есть делитель");
            }
        }
        if (t)
            System.out.println("делителя нету");
    }
}
