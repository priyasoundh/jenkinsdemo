import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Weight_asc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(b[i]>b[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}
