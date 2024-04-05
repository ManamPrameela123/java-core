package com.learningcourse.day2session;

public class BankAccount {
	
	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
	public BankAccount(int accNo,String custName, String accType, float balance)throws LowBalanceException, NegativeAmountException{
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		
		if(accType.equals("saving")) {
			if(balance < 1000)
				throw new LowBalanceException("Lowbalance");
		}else if (accType.equals("current")) {
			if(balance < 5000)
				throw new LowBalanceException("Lowbalance");
		}
		if(balance < 0)
			throw new NegativeAmountException("Negativeamount");
		this.balance = balance;
	}
	
	public void deposit(float amt) throws NegativeAmountException {
		if(amt < 0)
			throw new NegativeAmountException("Negativeamount");
		balance += amt ;
		
	}
	
	public float getbalance() throws LowBalanceException{
		if(balance < 1000 && accType.equals("saving"))
			throw new LowBalanceException("Lowbalance");
		if(balance < 5000 && accType.equals("current"))
			throw new LowBalanceException("Lowbalance");
		return balance;
	}
	
	
	
}
