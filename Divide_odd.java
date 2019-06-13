import java.util.*;
import java.lang.*;
import java.io.*;
public class Divide_odd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a;
		for(int i=1;i<=n;i++)
		{
			a=n/i;
			if(n%i==0&&a%2==1)
			{
				System.out.println(i);
				i=n+1;
			}
		}
	}
}
