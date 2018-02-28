import java.util.Scanner;

public class Exp10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a1=0;
        int a2=1;
        System.out.println(a1);
        System.out.println(a2);
        for (int i=1; i<n; i++){
            if (a1+a2==i){
                int a0=a1;
                a1=a2;
                a2=i;
                System.out.println(i);
            }
        }
    }
}
