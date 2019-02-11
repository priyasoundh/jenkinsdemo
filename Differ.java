import java.util.*;
import java.lang.*;
import java.io.*;
class Differ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int k=sc.nextInt();
		int n1=str1.length();
		int n2=str2.length();
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		int i,count=0;
		if(n1==n2)
		{
			for(i=0;i<n1;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					count++;
				}
			}
			if(count==k)
			{
				System.out.println("yes");
			}
			else
				System.out.println("no");
		}
		else
			System.out.println("no");
	}
}
