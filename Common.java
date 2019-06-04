import java.util.*;
import java.lang.*;
import java.io.*;
public class Common
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b[]=new int[n];
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(b[i]==c[j])
				{
					System.out.print(b[i]+" ");
					c[j]=-1;
					j=n;
				}
			}
		}
	}
}
