package practice_java;
import java.util.*;
public class FibonacciSeries {
	public static void main(String args[]) {
		int num1=0;
		int num2=1;
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int res;
		for(int i=1;i<=range;i++) {
			System.out.println(num1);
			res=num1+num2;
			num1=num2;
			num2=res;
		}
		
	}

}
