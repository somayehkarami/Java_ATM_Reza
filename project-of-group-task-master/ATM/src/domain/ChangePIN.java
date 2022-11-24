package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangePIN implements Menu {

	static Scanner input = new Scanner(System.in);

	@Override
	public int displayMenu(ArrayList<Account> accountList) {
		return 1;
	}

	public int changePin(Client client) {
		boolean check = true;
		while (check) {
			System.out.print("Enter your 4 digit pin : ");
			int pin = input.nextInt();

			if (pin != client.getBankCard().getCardPIN()) {
				System.out.println("Wrong PIN! Try again!");
			} else if

			(pin == client.getBankCard().getCardPIN()) {
				System.out.println("Enter your NEW PIN");
				int newPIN1 = input.nextInt();
				System.out.println("Please re-enter your new PIN");
				int newPIN2 = input.nextInt();
				if (newPIN1 != newPIN2) {
					System.out.println("Your new PIN does not match");
				} else {
					client.getBankCard().setCardPIN(newPIN1);
					System.out.println("Your PIN has been changed successfully");
					check = false;
				}
			}
		}
//		bankCard.changePIN();
		System.out.println("Press Enter key to continue...");
		try {
			System.in.read();
		} catch (Exception e) {
		}
		return 1;
	}
}