import java.util.*;
import java.lang.*;
import java.io.*;
class Oddfactor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,count=0,i,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=a%10;
		for(i=1;i<=a;i++)
		{
		    if(a%i==0)
		    {
		    	if(i%2!=0)
		    	{
		        	System.out.print(i+" ");
		    	}
		    }
		}
	}
}
