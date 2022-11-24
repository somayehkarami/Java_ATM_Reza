package domain;
import java.util.ArrayList;
import java.util.Scanner;

public class Withdrawal implements Menu{
	static Scanner input = new Scanner(System.in);

	@Override
	public int displayMenu(ArrayList<Account> accountList) {
		double amount = 0;
		boolean check = false;
		do {
			System.out.println();
			System.out.print("Enter the amount of withdrawal:");
			amount = input.nextDouble();
			amount = Math.round(amount * 100) / 100.0;
			if (amount > 0) {
				check = true;
			} else {
				System.out.println("Wrong amount. Try again");
			}
		} while (!check);
		System.out.println("Your accounts:");
		for (Account n : accountList) {
			System.out.println(n.getAccountID());
		}
		check = false;
		do {
			System.out.print("Choose your account:");
			int acc = input.nextInt();
			for (int i = 0; i < accountList.size(); i++) {
				if (acc == accountList.get(i).getAccountID()) {
					accountList.get(i).withdrawal(amount);
					System.out.println();
					System.out.println(accountList.get(i).toString());
					System.out.println("Account balance is " + accountList.get(i).getBalance());
					check = true;
				}
			}
		} while (!check);
		System.out.println();
		System.out.println("Press Enter key to continue...");
		try {
			System.in.read();
		} catch (Exception e) {
		}
		return 1;
	}

}
