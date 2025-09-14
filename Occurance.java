package practice_java;
import java.util.*;
public class Occurance {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int size=sc.nextInt();
		int nums[]=new int[size];
		for(int i=0;i<size;i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		
		System.out.print("enter the key value: ");
		int key=sc.nextInt();
		int new_arr[]=new int[size];
		int count=0;
		
		for(int i=0;i<size;i++)
		{
			if(nums[i]!=key)
			{
				new_arr[count]=nums[i];
				count+=1;
			}
		}
		
		if(count==0) {
			System.out.println("the array is empty");
		}
		else
		{
			for(int i=0;i<count;i++)
			{
				System.out.println(new_arr[i]);
			}
		}

	}
	
}
