import java.util.Scanner;
import java.math.*;

public class Exp7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i=0;
        while (i<a){
            i++;
            double k=a/i;
            if ((double)a/i==k)
                System.out.println(i);
        }
    }
}
