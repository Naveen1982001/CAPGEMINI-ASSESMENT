package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory{
	
	@Override
	public SavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalary) 
	{
		MMSavingAcc mmsaving= new MMSavingAcc(accNo , accNm, accBal, isSalary);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal, float creditLimit) 
	{
		MMCurrentAcc mmcurrent = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return mmcurrent;
	}

}
