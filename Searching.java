import java.util.*;
public class Searching
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int a[]=new int[n];
	    int i,count=0;
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(i=0;i<n;i++)
	    {
	        if(k==a[i])
	        {
	            System.out.println("yes");
	            count=1;
	            i=n;
	        }
	    }
	    if(count==0)
	    {
	        System.out.println("no");
	    }
	}
}
