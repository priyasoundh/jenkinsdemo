import java.util.*;
import java.lang.*;
import java.io.*;
public class Space_remove
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		char ch[]=str1.toCharArray();
		int n=str1.length();
		for(int i=0;i<n;i++)
		{
			if(ch[i]!=' ')
			{
				System.out.print(ch[i]);
			}
		}
	}
}
