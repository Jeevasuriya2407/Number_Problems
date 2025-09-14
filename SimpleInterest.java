package practice_java;
import java.util.*;
public class SimpleInterest {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the principal amount: ");
		int principal=sc.nextInt();
		System.out.println("enter the number of years: ");
		int years=sc.nextInt();
		System.out.println("enter the rate of interest: ");
		int rate=sc.nextInt();
		
		int calculate=principal*years*rate;
		int result=calculate/100;
		
		System.out.println("The Simple intrest for the amount "+principal+" for"+years+" at the rate of "+rate +"is: "+result);
		}

}
