import java.util.*;
import java.lang.*;
import java.io.*;
public class Odd_digits_sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digits=0,sum=0,a;
		int b[]=new int[10];
		while(n>0)
		{
			int count=0;
			a=n%10;
			b[digits]=a;
			n=n/10;
			for(int i=0;i<digits;i++)
			{
				if(b[digits]==b[i])
				{
					count++;
				}
			}
			if(count==0)
			{
				sum+=a;
			}
			digits++;
		}
		if(sum%2==0)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("O");
		}
	}
}
