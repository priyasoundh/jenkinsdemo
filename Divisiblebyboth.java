import java.util.*;
public class Divisiblebyboth
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int l=sc.nextInt();
	    int r=sc.nextInt();
	    int i,temp,c;
	    if(l>r)
	    {
	        temp=l;
	        l=r;
	        r=temp;
	    }
	    for(i=1;i<=r;i++)
	    {
	        c=i*l;
	        if(c%r==0)
	        {
	            System.out.println(c);
	            i=r+1;
	        }
	    }
	}
}
