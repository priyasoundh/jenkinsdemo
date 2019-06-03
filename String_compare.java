import java.util.*;
import java.lang.*;
import java.io.*;
public class String_compare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int n1=str1.length();
		int n2=str2.length();
		if(n1==n2)
		{
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			int count=0;
			for(int i=0;i<n1;i++)
			{
				if(ch1[i]==ch2[i])
				{
					count++;
				}
			}
			if(count==n1)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		else
		{
			System.out.println("no");
		}
	}
}
