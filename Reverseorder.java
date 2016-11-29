package numberreversal;
import java.util.Scanner;
public class Reverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scannerobj=new Scanner(System.in);
System.out.println("please enter your number");
		int no=Scannerobj.nextInt();
int rem ;
while(no>0)
{

rem=no%10;
	System.out.println(rem);
	no=no/10;

}


	}
	}


