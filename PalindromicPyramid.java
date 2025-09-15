package practice_java;
import java.util.*;

public class PalindromicPyramid {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of lines: ");
		int lines=sc.nextInt();
		for(int i=1;i<=lines;i++)
		{
			for(int j=i;j<lines;j++) {
				System.out.print(" ");
			}
			for(int l=i;l>=1;l--)
			{
				System.out.print(l);
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println("");
		}
	}

}
