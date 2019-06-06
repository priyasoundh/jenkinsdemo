import java.util.*;
import java.lang.*;
import java.io.*;
public class Xor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		b=a[0];
		for(int i=1;i<n;i++)
		{
			b=(b&(~a[i]))|(~b&(a[i]));
		}
		System.out.println(b);
	}
}
