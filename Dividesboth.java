import java.util.*;
public Dividesboth
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int temp,c,i;
	    if(b<a)
	    {
	        temp=a;
	        a=b;
	        b=temp;
	    }
	    for(i=1;i<=a;i++)
	    {
	        c=a/i;
	        if(a%i==0)
	        {
	            if(b%c==0)
	            {
	                System.out.println(c);
	                i=a+1;
	            }
	        }
	    }
	}
}
