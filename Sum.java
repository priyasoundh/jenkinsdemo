import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		int count=0,c=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					count=b[i]+b[j];
					if(count==a)
					{
						c=1;
						j=n;
						i=n;
					}
				}
			}
		}
		if(c==0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
