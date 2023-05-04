package com.cg.assignment6;

public class Account {

	 int accno;
	 double accbal;
	
	Account(int accno,double accbal)	
	{
		this .accno=accno;
		this .accbal=accbal;
	 }
	
     void Deposite()
     {
    	System.out.println("My current Account deposited amount "+ accbal);  	
     }
	
     void withdraw()
     {
    	 System.out.println("My current withdraw amount "+accbal);
     }
     
    final  void  balance_enquire()
   {
	   System.out.println("my current balance is "+accbal);	  
   }
   
   
     public static void main(String[] args) {
		 Account a1=new Account(345,500.0);
		 System.out.println("It is my account number :"+a1.accno);	
		 a1.Deposite();
		 a1.withdraw();
		 a1.balance_enquire();
		 
		 SavingAccount s1=new  SavingAccount();
		 s1.Deposite(500.0);
		 s1.withdraw(500.0);
		 
		 LoanAccount l1=new  LoanAccount();
		 l1.Deposite(500.0);
		 l1.withdraw(500.0);
		 
		 System.out.println("__________________________________________________________-");
		 Account a2=new Account(12,500.0);
		 System.out.println("It is my account number :"+a2.accno);	
		 a1.Deposite();
		 a1.withdraw();
		 a1.balance_enquire();
		 
		 SavingAccount s2=new  SavingAccount();
		 s2.Deposite(200.0);
		 s2.withdraw(200.0);
		 
		 LoanAccount l2=new  LoanAccount();
		 l2.Deposite(100.0);
		 l2.withdraw(100.0);
	}
   
}
