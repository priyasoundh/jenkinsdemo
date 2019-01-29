import java.util.*;
public class Sort
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,count=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            if(a[i-1]<a[i])
            {
                
            }
            else
            {
                count++;
                i=n;
            }
        }
        if(count==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
