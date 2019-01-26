import java.util.*;
public class Nonrepeated
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int i,j,temp,count;
	    for(i=0;i< n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(i=0;i< n;i++)
	    {
	        count=0;
	        for(j=0;j<n;j++)
	        {
	            if(i!=j)
	            {
	            if(a[i]==a[j])
	            {
	                count++;
	            }
	            }
	        }
	        if(count==0)
	        {
	            System.out.println(a[i]);
	            i=n;
	        }
	    }
	}
}
