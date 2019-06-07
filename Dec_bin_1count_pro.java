import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Dec_bin_1count_pro
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int n=x*y;
		long a=0,b=0,c=1,d=0;
		while(n>0)
		{
			a=n%2;
			n=n/2;
			b=n;
			d=(c*a)+d;
			c=c*10;
		}
		d=(c*b)+d;
		int count=0;
		while(d>0)
		{
			b=d%10;
			d=d/10;
			if(b==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
