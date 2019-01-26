import java.util.*;
public class Rev_str_wout_vowels
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String s=sc.next();
	    char ch[]=s.toCharArray();
	    int i;
	    for(i=n-1;i>=0;i--)
	    {
	        if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'&&ch[i]!='A'&&ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U')
	        {
	            System.out.print(ch[i]);
	        }
	    }
	}
}
