import java.util.*;
import java.lang.*;
import java.io.*;
public class String_delete
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.next();
		String[] s2=s.split("\\s");
		int count=0;
		for(String w:s2)
		{
			if(w.equals(s1))
			{
				
			}
			else
			{
				System.out.print(w+" ");
			}
		}
		
	}
}
