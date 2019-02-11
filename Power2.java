import java.util.*;
import java.lang.*;
import java.io.*;
class Power2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1,count=0;
		while(b<=a)
		{
			if(b==a)
			{
				count++;
				System.out.println("yes");
			}
			b=b*2;
		}
		if(count==0)
		{
			System.out.println("no");
		}
	}
}
