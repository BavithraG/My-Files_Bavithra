public class ArithmeticOperator {
    public static void main(String[] args) {
        byte a=3, b=6, c=9, d=12;
        System.out.println("Sum of a and b");
        System.out.println(a+b);
        System.out.println("Difference of a and d");
        System.out.println(a-d);
        System.out.println("Product of a, b, and d");
        System.out.println(a*b*d);
        System.out.println("Divide c by a");
        System.out.println(c/a);
        System.out.println("Modulus of a by b");
        System.out.println(a%b);
        System.out.println("Is b greater than c");
        System.out.println(a>c);
        System.out.println("Is b smaller than a and c");
        System.out.println(b<a && b<c);
        System.out.println("Is c smaller than b and d");
        System.out.println(c<b || c<d);
    }
    
}
