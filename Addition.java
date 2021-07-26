import arithmetic.*;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        System.out.println("enter the numbers");
        Scanner s = new Scanner (System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int a = num1*num1;
        int b = num2*num2*num2;
        ArithmeticPackage x = new ArithmeticPackage();
        System.out.println(x.sub(a, b));
    }
}
