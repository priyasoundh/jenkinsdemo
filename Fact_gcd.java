import java.util.*;
import java.lang.*;
import java.io.*;
public class Fact_gcd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=gcd(fact(a),fact(b));
		System.out.println(c);
	}
	public static long fact(long x)
	{
		long a=1;
		for(long i=2;i<=x;i++)
		{
			a=a*i;
		}
		return a;
	}
	public static long gcd(long a,long b)
	{
		if(b==0)
		{
			return a;
		}
		return gcd(b,a%b);
	}
}
