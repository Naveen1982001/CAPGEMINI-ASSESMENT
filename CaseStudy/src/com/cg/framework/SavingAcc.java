package com.cg.framework;

public abstract class SavingAcc extends BankAcc {

	private boolean isSalary;
	private static final float MINBAL= 5000.0f;
	
	
	
	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	public static float getMinbal() {
		return MINBAL;
	}
	

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}

	public void withdraw(float accBal) 
	{
		System.out.println("Your Account balance is: "+accBal);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", isSalary()=" + isSalary() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


}
