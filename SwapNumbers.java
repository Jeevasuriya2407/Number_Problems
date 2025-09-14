package practice_java;
import java.util.*;

public class SwapNumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number: ");
		int num1=sc.nextInt();
		System.out.print("enter the number: ");
		int num2=sc.nextInt();
		
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
