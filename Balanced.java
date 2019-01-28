import java.util.*;
public class Balanced
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    char ch[]=str.toCharArray();
	    int n=str.length();
	    int i,count=0;
	    for(i=0;i<n;i++)
	    {
	        if(ch[i]=='(')
	        {
	            count=count+1;
	        }
	        if(ch[i]==')')
	        {
	            count=count-1;
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
