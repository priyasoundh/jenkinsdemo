import java.util.*;
import java.lang.*;
import java.io.*;
public class Kth_case
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char a;
		int k=sc.nextInt();
		int n=s.length();
		char ch[]=s.toCharArray();
		for(int i=k-1;i<n;i+=k)
		{
			a=Character.toUpperCase(ch[i]);
			ch[i]=a;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ch[i]);
		}
	}
}
