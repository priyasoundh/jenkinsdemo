import java.util.*;
public class Shiftright
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int i,j=0,l=0,c;
	    int a[]=new int[n];
	    int b[]=new int[n];
	    while(k>n)
	    {
	        k=k-n;
	    }
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(i=n-k;i<n;i++)
	    {
	        b[j]=a[i];
	        j++;
	    }
	    c=j;
	    for(i=c;i<n;i++)
	    {
	        b[j]=a[l];
	        l++;
	        j++;
	    }
	    for(i=0;i<n;i++)
	    {
		    System.out.println(b[i]);
	    }
	}
}
