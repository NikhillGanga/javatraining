package com.bank.account;

public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String message)
	{
		super(message);
		//System.err.println(message);
	}

}
