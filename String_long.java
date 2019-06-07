import java.util.*;
import java.lang.*;
import java.io.*;
public class String_long
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int n1=s1.length();
		int n2=s2.length();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int n=n1;
		if(n1>n2)
		{
			n=n2;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ch1[i]);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ch2[i]);
		}
	}
}
