import java.util.*;
import java.lang.*;
import java.io.*;
public class Large_num
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp,b=0;
		for(int i=0;i<n;i++)
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
			b=(b*10)+a[i];
		}
		System.out.println(b);
	}
}
