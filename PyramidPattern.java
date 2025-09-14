package practice_java;
import java.util.*;

public class PyramidPattern {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of lines: ");
		int lines=sc.nextInt();
		for(int i=1;i<=lines;i++) {
			for(int j=i;j<lines;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
