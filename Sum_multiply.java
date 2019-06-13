import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum_multiply
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long p=sc.nextLong();
		long q=sc.nextLong();
		long r=sc.nextLong();
		long a[]=new long[n];
		long sum=0,count;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				for(int k=j;k<n;k++)
				{
					count=(p*a[i])+(q*a[j])+(r*a[k]);
					if(count>sum)
					{
						sum=count;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
