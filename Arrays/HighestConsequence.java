package Arrays;

import java.util.Scanner;

//Day1
//[1,0,1,1,0,0,1,1,1]
//output 
//ans=3
//Time-complexity -o(n)
public class HighestConsequence 
{

public static void main(String args[])
{
	
Scanner obj=new Scanner(System.in);

int size=obj.nextInt();
int arr[]=new int[size],count=1,large=1;


for(int j=0;j<size;j++)
{
	arr[j]=obj.nextInt();
}


for(int i=0;i<size-1;i++)
{
	if(arr[i]==arr[i+1])
	{
		count=count+1;
		if(count>large)
		{
			large=count;
		}
	}else
	{
		count=1;
	}
}

System.out.println(large);

	
}
	
	
}
