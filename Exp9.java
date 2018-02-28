import java.math.*;

public class Exp9 {
    public static void main(String args[]) {
        int b=100;
        for (int a=2; a<101; a++){
            Boolean t=true;
            int i=1;
            while ((t) && ( i<Math.round(Math.sqrt(a)))){
                i++;
                if ((double) a/i==a/i)
                    t = false;
            }
            if (t)
                System.out.println(a);
        }

    }
}
