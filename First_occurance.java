import java.util.*;
import java.lang.*;
import java.io.*;
public class First_occurance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String k=sc.next();
		char ch1[]=k.toCharArray();
		char ch[]=str.toCharArray();
		int n=str.length();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(ch[i]==ch1[0])
			{
				count=i+1;
				i=n;
			}
		}
		System.out.println(count);
	}
}
