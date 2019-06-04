import java.util.*;
import java.lang.*;
import java.io.*;
public class Kth_char
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		int n=s.length();
		char ch[]=s.toCharArray();
		for(int i=k-1;i<n;i+=k)
		{
			System.out.print(ch[i]+" ");
		}
	}
}
