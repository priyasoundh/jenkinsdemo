import java.util.*;
import java.lang.*;
import java.io.*;
public class Datatype
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		if((a>=-2147483648)&&(a<=2147483647))
		{
			System.out.println("INT");
		}
		else
		{
			System.out.println("LONG");
		}
	}
}
