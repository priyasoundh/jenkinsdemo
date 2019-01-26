import java.util.*;
public class Stringadd3
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    char a;
	    char ch[]=str.toCharArray();
	    int n=str.length();
	    int i,c;
	    for(i=0;i<n;i++)
	    {
	        c=ch[i];
	        if(c<88)
	        {
	            a=(char)(c+3);
	            System.out.print(a);
	        }
	        else
	        {
	            c=(90-c)+65;
	            a=(char)c;
	            System.out.print(a);
	        }
	    }
	}
}
