import java.util.*;
import java.lang.*;
import java.io.*;
public class Skate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][2];
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
			if(a[i][0]<a[i][1])
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
