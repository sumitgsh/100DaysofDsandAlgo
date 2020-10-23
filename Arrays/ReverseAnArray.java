package Arrays;

import java.util.Scanner;

//Day-1
//Time COmplexity O(n)
public class ReverseAnArray {

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size =obj.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
		}
		
		for(int j=size-1;j>=0;j--)
		{
			System.out.print(arr[j]+" ");
		}
			
				
	}
}
