import java.util.*;
import java.lang.*;
import java.io.*;
public class Odd
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
		int b=0,c=0,e=0,o=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				b++;
				e=a[i];
			}
			else
			{
				c++;
				o=a[i];
			}
		}
		if(b==1)
		{
			System.out.println(e);
		}
		else
		{
			System.out.println(o);
		}
	}
}
