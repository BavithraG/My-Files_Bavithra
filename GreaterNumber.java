public class GreaterNumber{
	public static void main(String[] args){
		byte a=89, b=9, c=45;
		if(a>b && a>c){
			System.out.println("a is greater");
		}
		else if(b>a && b>c){
			System.out.println("b is greater");
		}
		else{
			System.out.println("c is greater");
		}
	}
}