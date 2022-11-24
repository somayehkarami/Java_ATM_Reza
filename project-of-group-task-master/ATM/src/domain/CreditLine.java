package domain;

import java.util.ArrayList;

public class CreditLine extends Account {
	private double creditLimit;

	public CreditLine(int newId, double newBalance, double creditLimit) {
		super(newId, newBalance);
		this.creditLimit = creditLimit;
	}

	@Override
	public void withdrawal(double amount) {
		if (creditLimit - amount < 0) {
			System.out.println("Insufficient Funds.");
		} else {
			transactionList.add(new Transaction("Withdrawal", amount));
			super.setBalance(super.getBalance() - amount);
		}
	}

}
