import java.util.Scanner;
class SumOfDiagonalElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        System.out.print("Enter the second number: ");
        int b = s.nextInt();
        while(a>=10){
            a=a/10;
        }
        System.out.print("The sum of the diagonal elements: "+((a)+(b%10)));
    }
}