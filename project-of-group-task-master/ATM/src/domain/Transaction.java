package domain;

import java.time.LocalDate;

public class Transaction {
	private LocalDate transactionDate = LocalDate.now();
	private String type;
	private double amount;

	public Transaction(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction Date: " + transactionDate + "    Type: " + type + ""
				+ "    Amount of transaction: " + amount + "\n";
	}
}
