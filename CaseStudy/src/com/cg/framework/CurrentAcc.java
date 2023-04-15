package com.cg.framework;

public abstract class CurrentAcc extends BankAcc{
    
	private final float creditLimit;
	
	
	
	public float getCreaditLimit() {
		return creditLimit;
	}

	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}


	public void acccurrent(float creditLimit ) 
	{
		System.out.println("Your withdraw credit limit is: "+creditLimit);
	}


	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreaditLimit()=" + getCreaditLimit() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
		
}
