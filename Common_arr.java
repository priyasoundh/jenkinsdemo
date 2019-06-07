import java.util.*;
import java.lang.*;
import java.io.*;
public class Common_arr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		int c;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<m;j++)
			{
				if(a[i]==b[j])
				{
					b[j]=-1;
					count++;
					if(count==1)
					{
						System.out.print(a[i]+" ");
					}
				}
			}
		}
	}
}
