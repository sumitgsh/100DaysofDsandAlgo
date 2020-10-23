package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

//Day-1
public class LeftRotation {
	
	public static void main(String args[])
	{
		
		Scanner obj=new Scanner(System.in);
		int arr[];
		
		int n=obj.nextInt();
		arr=new int[n];
		int d=obj.nextInt();
		
		for(int i=0;i<n;i++)
		{
			arr[(i+(n-d))%n]=obj.nextInt();
		}
		
		//Print the values
		for(int i=0;i<n;i++)
		{	
			System.out.println(arr[i]);
		}
		
		
		
	}

}
