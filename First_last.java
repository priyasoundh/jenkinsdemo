import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class First_last
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long a=n%10;
		long b=0;
		while(n>0)
		{
			b=n%10;
			n=n/10;
		}
		System.out.println(a+b);
	}
}
