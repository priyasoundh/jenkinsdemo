import java.util.*;
import java.lang.*;
import java.io.*;
public class Merge
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n=n1+n2;
		int a[]=new int[n1];
		int b[]=new int[n2];
		int c[]=new int[n];
		int temp;
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
			c[i]=a[i];
		}
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
			c[n1+i]=b[i];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(c[i]>c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
			System.out.print(c[i]+" ");
		}
	}
}
