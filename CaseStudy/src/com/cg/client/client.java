package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class client {

	public static void main(String[] args) {
		BankFactory bankwork = new MMBankFactory();
		SavingAcc accsaving = new MMSavingAcc(4056, "Naveen", 63.22f, true);
		accsaving.withdraw(accsaving.getAccBal());
		accsaving.toString();
		CurrentAcc acccurrent = new MMCurrentAcc(4115, "M", 50000f, 8000f);
		acccurrent.withdraw(acccurrent.getCreaditLimit());
		acccurrent.toString();

	}

}
