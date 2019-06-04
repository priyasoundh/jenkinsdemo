import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		BigInteger f = new BigInteger("1");
		for(int i=1;i<=k;i++)
		{
			f = f.multiply(BigInteger.valueOf(n));
		}
		System.out.println(f);
	}
}
