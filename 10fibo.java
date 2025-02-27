import java.util.*;
class fibo
{
	public static void main(String args[])
	{
		int a = 0;
		int b = 1; 
		int c; 
		int n = 10; 
		int i;
		int sum=a+b;
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<n;i++)
		{	
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			sum=sum+c;
		}
		System.out.println("Sum of fibonacci series:"+sum);
	}
}
