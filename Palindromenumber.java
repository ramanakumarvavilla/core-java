package programs;
import java.util.Scanner;
public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter number");
Scanner read=new Scanner(System.in);
int num=read.nextInt();
int n=num;
int rev=0,rmd;
while(num>0){
	rmd=num%10;
	rev=rev*10+rmd;
	num=num/10;

}
if(rev==n)

	System.out.println(n+"is a palindrome number!");
	else
		System.out.println(n+"is not a palindrome number!");
		
	
	}
}
