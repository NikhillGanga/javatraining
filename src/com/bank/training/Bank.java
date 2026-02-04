package com.bank.training;

public class Bank {

	static int  bankBalance;
	int transactionAmount;
	int finalBalance;
	int depositAmount;
	int withdrawAmount;
	public static int getBankBalance() {
		return bankBalance;
	}
	public static void setBankBalance(int bankBalance)  {
	 	 
	 if(bankBalance<0)
			System.out.println("Invalid Amount");
		Bank.bankBalance = bankBalance;
	}
	public int getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public int getFinalBalance() {
		return finalBalance;
	}
	public void setFinalBalance(int finalBalance) {
		this.finalBalance = finalBalance;
	}
	public int getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		if(depositAmount<0)
			System.out.println("Invalid Amount");
		this.depositAmount = depositAmount;
	}
	public int getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(int withdrawAmount) {
		if(bankBalance<0)
			System.out.println("Invalid Amount");
		this.withdrawAmount = withdrawAmount;
	}
	
	public void deposit() {
		finalBalance=bankBalance+depositAmount;
		bankBalance=finalBalance;
		System.out.println("After Deposit the balance is: "+finalBalance);
	}
	
	public void withdraw() {
		if(withdrawAmount>bankBalance)
			{
			System.out.println("Insufficient Balance");
			return;
			}
		finalBalance=bankBalance-withdrawAmount;
		bankBalance=finalBalance;
		System.out.println("After Withdraw the balance is: "+finalBalance);
	}
	
}
