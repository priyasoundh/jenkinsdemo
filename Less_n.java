import java.util.*;
import java.lang.*;
import java.io.*;
public class Less_n
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(b[i]<n)
			{
				System.out.print(b[i]+" ");
			}
		}
	}
}
