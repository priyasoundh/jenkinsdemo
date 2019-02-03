import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Insertmax
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int i,j,l=0;
	    int a[]=new int[n+k];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
 
	    for(i=0;i<k;i++)
	    {
	        a[n+i]=sc.nextInt();
	        for(j=0;j<=n+i;j++)
	        {
	            if(l<a[j])
	            {
	                l=a[j];
	            }
	        }
	        System.out.println(l);
	    }
	}
}
