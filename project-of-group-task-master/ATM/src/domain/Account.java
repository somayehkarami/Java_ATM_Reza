package domain;

import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Account{
	private int accountID;
	private double balance;
	private LocalDate dateCreated;
	protected ArrayList<Transaction> transactionList = new ArrayList<>();

	public Account() {
	}
	
	protected Account(int accountID, double balance) {
		this.accountID = accountID;
		this.balance = balance;
		this.dateCreated = LocalDate.now();
	}

	public int getAccountID() {
		return accountID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}
	 public Transaction getTransaction(int index) {
		 return transactionList.get(index);
	 }

	public void withdrawal(double amount) {
		if (balance - amount < 0) {
			System.out.println("Insufficien Funds.");
		} else {
			transactionList.add(new Transaction("Withdrawal", amount));
			balance -= amount;
		}
	}
	
	public void deposit(double amount) {
		transactionList.add(new Transaction("Deposit", amount));
		balance += amount;
	}
	
	public void transfer(double amount, Account account) {
		if (balance - amount < 0) {
			System.out.println("Insufficient Funds.");
		} else {
			transactionList.add(new Transaction("Transfer", amount));
			account.transactionList.add(new Transaction("Transfer", amount));
			balance -= amount;
			account.setBalance(account.getBalance() + amount);
		}
	}
	
	@Override
	public String toString() {
		return transactionList + " ";
	}
	
}
