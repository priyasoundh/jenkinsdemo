import java.util.*;
import java.lang.*;
import java.io.*;
public class Rep_num
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
		int b=0;
		for(int i=0;i<n;i++)
		{
			int count=0;
			if(a[i]!=-1)
			{
				for(int j=i;j<n;j++)
				{
					if(a[i]==a[j]&&i!=j)
					{
						a[j]=-1;
						count++;
					}
				}
			}
			if(count==0)
			{
				a[i]=-1;
				b++;
			}
		}
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(a[i]!=-1)
			{
				System.out.print(a[i]+" ");
			}
		}
		if(b==n)
		{
			System.out.print("unique");
		}
	}
}
