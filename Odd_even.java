import java.util.*;
import java.lang.*;
import java.io.*;
public class Odd_even
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
			if(a[i]%2==0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
