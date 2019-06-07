import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Fact2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		long c=fact(a)/fact(b);
		System.out.println(c);
	}
		public static long fact(int a)
		{
			long x=1;
			for(int i=2;i<=a;i++)
			{
				x=x*i;
			}
			return x;
		}
}
