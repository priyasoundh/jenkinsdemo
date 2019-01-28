import java.util.*;
public class Numericstring
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
	        if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
	        {
	       
	            System.out.println("no");
	            i=n;
	            count=1;
	        }
	    }
	    if(count==0)
	    {
		    System.out.println("yes");
	    }
	}
}
