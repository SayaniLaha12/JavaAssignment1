import java.util.*;
class fibo
{
	public static void main(String args[])
	{
		int a=0;
		int b=1;
		int c;
		int i;
		int n=10;
		String primenumbers="";
		System.out.println(a+b);		
		
		for(i=2;i<n;i++)
		{	
		c=a+b;
		a=b;
		b=c;
		}
		System.out.println(c);
			
	}	
} 
	 