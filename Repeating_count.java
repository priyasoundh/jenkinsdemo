import java.util.*;
import java.lang.*;
import java.io.*;
class Repeating_count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==k)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("yes "+count);
		}
		else
		{
			System.out.println("no");
		}
	}
}
