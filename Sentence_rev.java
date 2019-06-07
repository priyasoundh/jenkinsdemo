import java.util.*;
import java.lang.*;
import java.io.*;
public class Sentence_rev
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s2=s.split("\\s");
		String a[]=new String[100];
		int count=0,i=0;
		for(String w:s2)
		{
			a[i]=w;
			i++;
		}
		int n=i;
		System.out.print(a[0]+" ");
		for(i=1;i<n-1;i++)
		{
			char ch[]=a[i].toCharArray();
			int m=a[i].length();
			for(int j=m-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		System.out.print(a[n-1]+" ");
	}
}
