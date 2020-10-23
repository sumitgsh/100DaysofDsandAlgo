package Arrays;

import java.util.Scanner;

//Day-1
public class SubArrayWithGivenSum
{
public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	int t=obj.nextInt();
	for(int i=0;i<t;i++)
	{
		int n=obj.nextInt();
		int s=obj.nextInt();
		int arr[]=new int[n];
		
		for(int j=0;j<n;j++)
		{
			arr[j]=obj.nextInt();
		}
		
		
		//find the sub array
		int lindex=0,rindex=1,sum=arr[0];
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		while(rindex<=n)
		{
			
			if(sum==s)
			{
				System.out.println((lindex+1)+" "+(rindex));
				break;
			}
			
			if(sum>s && lindex<rindex)
			{
			sum=sum-arr[lindex];
			lindex=lindex+1;
			
			}else if(sum<s && rindex<n) {
		 	sum=sum+arr[rindex];
			rindex=rindex+1;
			}
		}
		if(sum!=s)
		{
			System.out.println(-1);
		}
		
	}

	
}
	
}
