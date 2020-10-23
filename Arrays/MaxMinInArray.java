package Arrays;

import java.util.Scanner;

//Day-1
public class MaxMinInArray {

public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	
	int size=obj.nextInt();
	int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
	int arr[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		arr[i]=obj.nextInt();
		
	}
	
	for(int j=0;j<size;j++)
	{
		if(arr[j]<min)
		{
			min=arr[j];
		}
		
		if(arr[j]>max)
		{
			max=arr[j];
		}
		
	}
	
	System.out.println("Max value"+max+"\nMin value"+min);
	
}
	
}
