import java.util.*;
import java.lang.*;
import java.io.*;
public class Mirror
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==b[n-1-i])
			{
				count++;
			}
		}
		if(count==n)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
