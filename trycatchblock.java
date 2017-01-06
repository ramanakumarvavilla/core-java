package exception;
import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner trycatch=new Scanner(System.in);
	System.out.println("please enter the numbers");
	int a=trycatch.nextInt();
	int b=trycatch.nextInt();
	try
	{
		System.out.println(a*b);
	}
	catch(ArithmeticException awe){
		
	
	System.out.println("please check the number");
	multiply();
	
	
	
	
	}
finally{
	System.out.println("i am finally");
	}
}
	private static void divide() {
		// TODO Auto-generated method stub
		
	}



}
