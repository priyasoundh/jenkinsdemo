import java.util.*;
public class Stringshift
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    int n=str.length();
	    int k=sc.nextInt();
	    int i,j=0,l=0,c;
	    char a[]=str.toCharArray();
	    char b[]=new char[n];
	    while(k>n)
	    {
	        k=k-n;
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
		    System.out.print(b[i]);
	    }
	}
}
