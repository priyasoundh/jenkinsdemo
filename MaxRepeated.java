import java.util.*;
public class MaxRepeated
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    char ch[]=a.toCharArray();
	    int n=a.length();
	    char c=' ';
	    int i,j,b=0,count;
	    for(i=0;i<n;i++)
	    {
	        count=0;
	        for(j=0;j<n;j++)
	        {
	            if(i!=j)
	            {
	                if(ch[i]==ch[j])
	                {
	                    count++;
	                }
	            }
	        }
	        if(b<count)
	        {
	            b=count;
	            c=ch[i];
	        }
	    }
		System.out.println(c);
	}
}
