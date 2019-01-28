import java.util.*;
public class Thirdchar
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    char ch[]=str.toCharArray();
	    int n=str.length();
	    int i,count=0;
	    for(i=0;i<=n/3;i++)
	    {
	        System.out.print(ch[i*3]);
	    }
	}
}
