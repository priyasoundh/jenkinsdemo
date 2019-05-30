import java.util.*;
import java.lang.*;
import java.io.*;
public class Length
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(char ch:s.toCharArray())
		{
			count++;
		}
		System.out.println(count);
	}
}
