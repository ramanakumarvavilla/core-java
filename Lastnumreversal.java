package numberreversal;
import java.util.Scanner;
public class Lastnumreversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scannerobj=new Scanner(System.in);
System.out.println("please enter your number");
		int no=Scannerobj.nextInt();
int rem ;
rem=no%10;
	System.out.print(rem);
	no=no/10;
System.out.print(no);
}



	}


