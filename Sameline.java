import java.util.*;
public class Sameline
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int a[]=new int[6];
	    int i;
	    for(i=0;i<6;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    if(a[0]==a[2]&&a[2]==a[4])
	    {
	        System.out.println("yes");
	    }
	    else if(a[1]==a[3]&&a[3]==a[5])
	    {
	        System.out.println("yes");
	    }
	    else
	    {
	        System.out.println("no");
	    }
	}
}
