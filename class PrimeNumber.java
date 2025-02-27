import java.util.*;
class PrimeNumber
{
	public static void main(String args[])
	{
		int a;
		int i;	
		int count=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(i=2;i<a;i++)
		{
			if (a%i==0)
			{
			count++;
			}
		}

   		if (count==0)
		{
			System.out.println("the number is a prime number");
	     	}
		else
		{ 
			System.out.println("the number is not prime");
		}
	}	  
} 
	 