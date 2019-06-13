import java.util.*;
import java.lang.*;
import java.io.*;
public class Zeros
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b=-1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--)
		{
			if(a[i]==0)
			{
				b=i;
				i=-1;
			}
		}
		if(b==-1)
		{
			b=n;
		}
		for(int i=0;i<b;i++)
		{
			if(a[i]==1)
			{
				System.out.print("1 ");
			}
		}
	}
}
