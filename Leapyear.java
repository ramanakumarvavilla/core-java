package programs;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year = 2004;
Scanner in=new Scanner(System.in);
if((year%400==0)||((year%4==0)&&(year%100!=0)))
	System.out.println("year"+year+"is a leap year");
	else 
		System.out.println("year"+year+"is not a leap year");
	
	}
	

}
