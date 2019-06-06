import java.util.*;
import java.lang.*;
import java.io.*;
public class Increasing_subarray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=1,b=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			if(a[i]<a[i+1])
			{
				count++;
			}
			else
			{
				if(b<count)
				{
					b=count;
				}
				count=1;
			}
		}
		if(b<count)
		{
			b=count;
		}
		System.out.println(b);
	}
}
