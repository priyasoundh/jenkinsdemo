import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Push_0
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==0)
			{
				count++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		for(int i=0;i<count;i++)
		{
			System.out.print("0 ");
		}
	}
}
