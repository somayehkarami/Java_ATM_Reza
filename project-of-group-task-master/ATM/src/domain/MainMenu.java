package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu implements Menu {
	static Scanner input = new Scanner(System.in);

	@Override
	public int displayMenu(ArrayList<Account> accountList) {
		int choice = 0;
		do {
			System.out.println();
			System.out.println("\t  Welcome to our Bank");
			System.out.println();
			System.out.println("1. MainMenu\t\t4. Transfer");
			System.out.println();
			System.out.println("2. Withdrawal\t\t5. Display Balance");
			System.out.println();
			System.out.println("3. Deposit\t\t6. Change PIN ");
			System.out.println();
			System.out.println("0 - To exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
			if (choice >= 0 && choice < 7) {
				return choice;
			} else {
				System.out.println("Error: Invalid choice. Try again");
				System.out.println();
			}
		} while (true);
	}

}
