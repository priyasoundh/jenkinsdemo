import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Swap
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
		for(int i=0;i<n;i+=2)
		{
			if(i+1!=n)
			{
				System.out.print(a[i+1]+" "+a[i]+" ");
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
