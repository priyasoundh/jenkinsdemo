import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Power3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		BigInteger f = new BigInteger("1");
		for(int i=1;i<=b;i++)
		{
			f = f.multiply(BigInteger.valueOf(a));
		}
		f=f.mod(BigInteger.valueOf(c));
		System.out.println(f);
	}
}
