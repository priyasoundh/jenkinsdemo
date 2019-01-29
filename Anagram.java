import java.util.*;
public class Anagram
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
        String str1="kabali";
        int t=sc.nextInt();
        int k,c=0;
        for(k=0;k<t;k++)
        {
            String str2=sc.next();
            int n1=str1.length();
            int n2=str2.length();
            if(n1==n2)
            {
                char ch1[]=str1.toCharArray();
                char ch2[]=str2.toCharArray();
                int i,j,count=0;
                for(i=0;i<n1;i++)
                {
                    for(j=0;j<n2;j++)
                    {
                        if(ch1[i]==ch2[j])
                        {
                            ch1[i]=0;
                            ch2[j]=0;
                            j=n2;
                        }
                    }
                }
                for(i=0;i<n2;i++)
                {
                    if(ch2[i]!=0)
                    {
                        count++;
                    }
                }
                if(count==0)
                {
                    c++;
                }
            }
	    }
	    System.out.println(c);
    }
}
