import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class String_vowel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		int count=0,a=0;
		for(int i=0;i<n;i++)
		{
			count=0;
			s[i]=sc.next();
			char ch[]=s[i].toCharArray();
			int m=s[i].length();
			for(int j=0;j<m;j++)
			{
				if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u'||ch[j]=='A'||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U')
				{
					count++;
				}
			}
			if(count>0)
			{
				a++;
			}
		}
		if(a==n)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
