import java.util.Scanner;
import java.math.*;
//a=65
//z=90
public class Exp14 {
    public static void main(String args[]) {
        int a=65;
        int z=90;
        double a1 = (Math.random()+1)*((z-a)/2);
        int b =(int) Math.round(a1+65);
        Scanner scanner = new Scanner(System.in);
        Boolean t= true;
        while (t){
            System.out.println("Введите букву (A..Z)");
            char Ch = scanner.next().charAt(0);
            if (b==(int) Ch) {
                System.out.println("Верно");
                t = false;
            }
            else {
                if (b-((int) Ch)>0)
                    System.out.println("буква находится правее");
                else
                    System.out.println("буква левее");
            }
        }

    }
}
