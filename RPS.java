import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class RPS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		if(ch1[0]==ch2[0])
		{
			System.out.println("D");
		}
		else if(ch1[0]=='R')
		{
			if(ch2[0]=='P')
			{
				System.out.println("P");
			}
			if(ch2[0]=='S')
			{
				System.out.println("R");
			}
		}
		else if(ch1[0]=='P')
		{
			if(ch2[0]=='R')
			{
				System.out.println("P");
			}
			if(ch2[0]=='S')
			{
				System.out.println("S");
			}
		}
		else if(ch1[0]=='S')
		{
			if(ch2[0]=='R')
			{
				System.out.println("R");
			}
			if(ch2[0]=='P')
			{
				System.out.println("S");
			}
		}
	}
}
