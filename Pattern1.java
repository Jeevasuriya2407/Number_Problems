package practice_java;
import java.util.*;
public class Pattern1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of lines: ");
		int lines=sc.nextInt();
		int spaces=lines;
		for(int i=0;i<lines;i++) {
			for(int k=spaces-1;k>=0;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			spaces--;
		}
		
	}

}
