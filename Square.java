import java.util.*;
import java.lang.*;
import java.io.*;
class Square
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int i,count=0;
		double a,b;
		for(i=l;i<=r;i++)
		{
			a=java.lang.Math.sqrt(i);
			b=Math.round(a);
			if(a==b)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
