import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class String_rep
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s[]=new String[n];
		int count=0,b=0;
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(s[i].equals(s[j]))
				{
					count++;
				}
			}
			if(count==k)
			{
				b++;
			}
		}
		if(b==0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
