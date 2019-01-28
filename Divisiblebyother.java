import java.util.*;
public class Divisiblebyother
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int i,count=0;
	    for(i=2;i<a;i++)
	    {
	        if(a%i==0)
	        {
	            System.out.println("yes");
	            i=a;
	            count=1;
	        }
	    }
	    if(count==0)
	    {
		    System.out.println("no");
	    }
	}
}
