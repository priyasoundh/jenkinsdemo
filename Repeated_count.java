import java.util.*;
import java.lang.*;
import java.io.*;
public class Repeated_count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0,b=0;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=i;j<n;j++)
			{
				if(a[i]==a[j])
				{
					
					count++;
				}
			}
			if(count>b)
			{
				b=count;
			}
		}
		System.out.println(b);
	}
}
