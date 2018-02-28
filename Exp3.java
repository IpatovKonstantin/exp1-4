import java.util.Scanner;

public class Exp3 {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int days[] = new int[7];
    days[0] = 1;
    days[1] = 1;
    days[2] = 1;
    days[3] = 1;
    days[4] = 1;
    days[5] = 0;
    days[6] = 0;
    if (days[a-1]==1)
        System.out.println("false");
    else
        System.out.println("true");

    }
}
