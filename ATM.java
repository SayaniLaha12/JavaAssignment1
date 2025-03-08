import java.util.*;

class Bank
{
	public static void main(String args[])
	{
		System.out.println("Enter withdraw or deposit");
		Scanner sc= new scanner(System.in)
		String str= sc.nextLine();
		System.out.println("Enter the Amount:")
		double amt=sc.nextDouble();
	
	
	}

}	

class BankAccount
{
	int accountNumber;
	float balance;
	
	public int withdraw(double amount)
	{
		this.balance=bal;
		System.out.println("available balance is:" + bal);
		this.amount=amt;
		System.out.println("the withdrawn amount is:" +amt);
		bal=bal-amt;
		Sytem.out.println("the balance after withdraw is:" + bal );
		return bal;

	}

	public int deposit(double amount)
	{
		Sytem.out.println("the withdrawn amount is:" + amt);
		balance=balance+amount;
		System.out.println("available balance after withdraw is:" + bal);
		return bal;
  	}
}


class ATM
{
	void performTransaction(String type,double amount)
	{
		if(type=="deposit")
		{
			BankAccount Bank = new BankAccount();
			Bank.deposit(amt);
		}
		else if(type=="withdraw")
		{
			BankAccount Bank = new BankAccount();
			Bank.wthdraw(amt);
		}
    	}
}
	
	

	
	

	


