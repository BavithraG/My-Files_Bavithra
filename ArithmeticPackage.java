package arithmetic;
public class ArithmeticPackage {
    public int add(int a, int b){
        return(a+b);
    }
    public int sub(int a, int b){
        return(Math.abs(b-a));
    }
    public int mul(int a, int b){
        return(a*b);
    }
    public int div(int a, int b){
        return(a/b);
    }
    public int mod(int a, int b){
        return(a%b);
    }
}
