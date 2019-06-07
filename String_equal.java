import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class String_equal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		for(int i=0;i<n-1;i++)
		{
			if(s[i].equals(s[i+1]))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
