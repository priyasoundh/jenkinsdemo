import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Char_k
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		char ch[]=s.toCharArray();
		int n=s.length();
		int count=0,a;
		for(int j=0;j<=k;j++)
		{
			for(int i=0;i<n;i++)
			{
				a=Character.getNumericValue(ch[i]);
				if(a==j)
				{
					count++;
					i=n;
				}
			}
		}
		if(count==k+1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
