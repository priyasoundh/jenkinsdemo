import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Bin_dec
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long a=0,b=0,c=1;
		while(n>0)
		{
			a=n%10;
			a=a*c;
			b=a+b;
			n=n/10;
			c=c*2;
		}
		System.out.println(b);
	}
}
