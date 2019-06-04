import java.util.*;
import java.lang.*;
import java.io.*;
public class Factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long fact=1;
		for(int i=2;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
