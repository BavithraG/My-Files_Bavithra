public class Result{
	public static void main(String[] args){
		int a=100, b=45, c=78, d=89, e=90, x;
		x=(a+b+c+d+e)/5;
		if(x<=91 && x==100){
			System.out.println("Result: Distinction");
		}
		else if(x<=90 && x>=81){
			System.out.println("Result: First Class");
		}
		else if(x<=80 && x>=71){
			System.out.println("Result: Second Class");
		}
		else if(x<=70 && x>=61){
			System.out.println("Result: Third Class");
		}
		else if(x<=60 && x>35){
			System.out.println("Result: Pass");
		}
		else if(x<35 && x==0){
			System.out.println("Result: Fail");
		}
		else{
			System.out.println("Inavlid");
		}
	}
}
		