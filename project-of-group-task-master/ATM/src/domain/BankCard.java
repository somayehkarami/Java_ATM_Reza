package domain;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankCard {

	private long cardID;
	private int cardPIN;
	List<Account> accountList;

	public BankCard(long cardID, int cardPIN) {
		this.cardID = cardID;
		this.cardPIN = cardPIN;
		this.accountList = new ArrayList<Account>();
	}

	public long getCardID() {
		return cardID;
	}

	public void setCardID(long cardID) {
		this.cardID = cardID;
	}

	public int getCardPIN() {
		return cardPIN;
	}

	public void setCardPIN(int cardPIN) {
		this.cardPIN = cardPIN;

	}
	
	public ArrayList<Account> getAccountList(){
		return (ArrayList)accountList;
	}

	@Override
	public String toString() {
		return "BankCard [cardID=" + cardID + ", cardPIN=" + cardPIN + "]";
	}
	
	public void pinValidation() {
		Scanner input = new Scanner(System.in);
		boolean isException = true;

		while (isException) {
			System.out.println("Please enter your PIN");

			try {

				boolean isInputWrong = true;

				while (isInputWrong) {
					int yourPinInput = input.nextInt();

					if (cardPIN != yourPinInput) {
						System.out.println("Wrong Password, try again!");
						isInputWrong = true;
					} else {
						System.out.println("Thank You!");
						isInputWrong = false;
					}
				}
				isException = false;
			} catch (InputMismatchException e) {
				System.out.println("Can only have numbers");
				isException = true;
				input.next();

			}

		}

	}
}

	