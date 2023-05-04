package com.cg.assignment6;

public class SavingAccount extends Account
{
	SavingAccount() {
		super(0,000.0);			
	}

	void Deposite(double accbal)
	 {
		double sum1=0;
		 sum1=2000+accbal;
		System.out.println("This is deposite saving Add ="+sum1);	          
	 }

	 void withdraw(double accbal)
	 {
		double sum2=0;
		 sum2=2000-accbal;
		System.out.println("This is withdraw saving Sub ="+sum2);	 
	}
	 
	
}