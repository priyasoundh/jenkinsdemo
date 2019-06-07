import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ab
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
				i=n;
			}
		}
		if(count==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
