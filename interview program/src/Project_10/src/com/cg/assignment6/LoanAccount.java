package com.cg.assignment6;

public class LoanAccount extends Account {

	LoanAccount() {
		 super(0,0.0);
	}
	void Deposite(double accbal)
		 {
			double sum1=0;
			 sum1=1000-accbal;
			System.out.println("This is deposite loan Sub="+sum1);
		 }

		void withdraw(double accbal)
		{
			double sum2=0;
			 sum2=1000+accbal;
			System.out.println("This is withdraw loan Add="+sum2);		
		}
		
	}


