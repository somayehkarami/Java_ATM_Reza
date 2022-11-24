package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Access implements Menu {

	static Scanner input = new Scanner(System.in);

	public Access() {
	}

	public int displayAccessMenu(BankCard bankcard) {
		System.out.println("Welcome to our Bank.");
		System.out.println("Open 24 hours a day, 7 days a week.");
		System.out.println();
			
		bankcard.pinValidation();
		return 1;
	}
	
	@Override
	public int displayMenu(ArrayList<Account> accountList) {
		return 1;
	}

}

