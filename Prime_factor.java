import java.util.*;
import java.lang.*;
import java.io.*;
public class Prime_factor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			int count=0;
			if(n%i==0)
			{
				for(int j=1;j*j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.print(i+" ");
				}
			}
		}
	}
}
