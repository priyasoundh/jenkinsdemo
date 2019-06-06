import java.util.*;
import java.lang.*;
import java.io.*;
public class Case
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char a;
		int n=s.length();
		char ch[]=s.toCharArray();
		for(int i=0;i<n;i++)
		{
			a=Character.toUpperCase(ch[i]);
			if(a==ch[i])
			{
				a=Character.toLowerCase(ch[i]);
			}
			ch[i]=a;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ch[i]);
		}
	}
}
