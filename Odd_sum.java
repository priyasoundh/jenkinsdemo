import java.util.*;
import java.lang.*;
import java.io.*;
public class Odd_sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		if(l%2==0)
		{
			l=l+1;
		}
		int sum=0;
		for(int i=l;i<=r;i+=2)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}
