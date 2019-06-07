import java.util.*;
import java.lang.*;
import java.io.*;
public class Asc_dsc_k
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			for(int j=i;j<k;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		for(int i=k;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}
