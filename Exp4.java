import java.util.Scanner;

public class Exp4 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int j = str.length();
        int i=0;
        System.out.println((int) str.charAt(i));

        while ((i<j-1)&&(str.charAt(i)==str.charAt(j-1))){
            i++;
            j--;

        }
        if ((i==j)||(i==j-1))
            System.out.println("polynom");
        else
            System.out.println("ne polynom");


    }

    }
