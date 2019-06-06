import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Rev_str
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		int n=s.length();
		for(int i=n-1;i>=0;i--)
		{
			if(i==0)
			{
				System.out.print(ch[i]);
			}
			else
			{
				System.out.print(ch[i]+"-");
			}
		}
	}
}
