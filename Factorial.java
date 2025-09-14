package practice_java;
import java.util.*;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num1;i++) {
			fact=fact*i;
		}
		System.out.println("the factorial of the "+num1+"is  "+fact);
	}

}
