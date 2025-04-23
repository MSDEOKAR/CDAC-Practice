package com.acts;

import java.math.BigDecimal;

public class Account {
	//Using only 3 fields
	//Focus is on transaction so taken 2 fields only
	private String name;
	private BigDecimal balance;
	
	public Account(String name, BigDecimal balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public BigDecimal deposit(BigDecimal amount) {
		return balance.add(amount);
	}
	
	public BigDecimal withdraw(BigDecimal amount) {
		return balance.subtract(amount);
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}
}
