import java.util.*;
import java.lang.*;
import java.io.*;
class Hexadecimal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    char ch[]=str.toCharArray();
	    int n=str.length();
	    int i,count=0;
	    for(i=0;i<n;i++)
	    {
	    	if(ch[i]>='A'&&ch[i]<='F'||ch[i]>='0'&&ch[i]<='9')
	    	{
	    		count=count;
	    	}
	    	else
	    	{
	    		count=1;
	    		i=n;
	    	}
	    }
	    if(count==0)
	    {
	    	System.out.println("yes");
	    }
	    else
	    {
	    	System.out.println("no");
	    }
	}
}
