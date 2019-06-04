import java.util.*;
import java.lang.*;
import java.io.*;
public class Consecutive_pair_sum
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
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			count=count+a[i]+a[i+1];
		}
		System.out.println(count);
	}
}
