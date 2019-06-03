import java.util.*;
import java.lang.*;
import java.io.*;
class String_Compare_cis
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str11=sc.next();
		String str12=sc.next();
		int n1=str11.length();
		int n2=str12.length();
		String str1=str11.toUpperCase();
		String str2=str12.toUpperCase();
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
