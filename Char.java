import java.util.*;
import java.lang.*;
import java.io.*;
public class Char
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(ch[i]!='a'&&ch[i]!='b')
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
