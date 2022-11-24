package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Account ac1101 = new ChequingAccount(1101, 100.0);
		Account ac1201 = new SavingAccount(1201, 100.0);
		Account ac1301 = new CreditLine(1301, 0.0, 1000.00);

		Account ac1102 = new ChequingAccount(1102, 100.0);
		Account ac1202 = new SavingAccount(1202, 100.0);

		Account ac1103 = new ChequingAccount(1102, 100.0);
		Account ac1303 = new CreditLine(1302, 0.0, 1000.00);

		Account ac1104 = new ChequingAccount(1102, 100.0);
		Account ac1204 = new SavingAccount(1202, 100.0);
		Account ac1304 = new CreditLine(1302, 0.0, 1000.00);

		BankCard bc1 = new BankCard(123456789, 1234);
		bc1.accountList.add(ac1101);
		bc1.accountList.add(ac1201);
		bc1.accountList.add(ac1301);

		BankCard bc2 = new BankCard(987654321, 1155);
		bc2.accountList.add(ac1102);
		bc2.accountList.add(ac1202);

		BankCard bc3 = new BankCard(147258369, 4523);
		bc3.accountList.add(ac1103);
		bc3.accountList.add(ac1303);
		
		BankCard bc4 = new BankCard(963258741, 4517);
		bc4.accountList.add(ac1104);
		bc4.accountList.add(ac1204);
		bc4.accountList.add(ac1304);
		

		List<Client> clientsList = new ArrayList<Client>();
		clientsList.add(new Client("Khaled", 25, 'M', new Address("123", "Prince", "Montreal", "3H3 Z8J"), bc1));
		clientsList.add(new Client("Anastassia", 25, 'F', new Address("173", "Prince", "Montreal", "3H3 L2J"), bc2));
		clientsList.add(new Client("Somayeh", 25, 'F', new Address("193", "Prince", "Montreal", "5H3 Z2J"), bc3));
		clientsList.add(new Client("Teodor", 25, 'M', new Address("121", "Prince", "Montreal", "3H4 Z2J"), bc4));
		
		List<Menu> menuList = new ArrayList<>();
		menuList.add(new Access());
		menuList.add(new MainMenu());
		menuList.add(new Withdrawal());
		menuList.add(new Deposit());
		menuList.add(new Transfer());
		menuList.add(new DisplayBalance());
		menuList.add(new ChangePIN());
		
		ATM atm1 = new ATM("West Island, Montreal", menuList);
		
		Client mainClient = clientsList.get(0); // Card Scanner device - load the client
		
		for ( int i = 0; i < clientsList.size(); i++) {
			if (clientsList.get(i).getBankCard() == mainClient.getBankCard()) {
				if ( clientsList.get(i).getGender() == 'M') {
					System.out.println("We are glad to see you today, Mr. " + mainClient.getName());
				} else {
					System.out.println("We are glad to see you today, Mrs. " + mainClient.getName());
				}
			}
		}
		
		//System.out.println("We are glad to see you today, " + mainClient.getName());
		System.out.println();
		int choice = ((Access)atm1.getMenuList(0)).displayAccessMenu(mainClient.getBankCard());
		while(choice != 0) {
			switch(choice) {
			
				case 1:  choice = ((MainMenu)atm1.getMenuList(choice)).displayMenu(mainClient.getBankCard().getAccountList());break;
				
				case 2: choice = ((Withdrawal)atm1.getMenuList(choice)).displayMenu(mainClient.getBankCard().getAccountList());break;
				
				case 3: choice = ((Deposit)atm1.getMenuList(choice)).displayMenu(mainClient.getBankCard().getAccountList());break;
				
				case 4: choice = ((Transfer)atm1.getMenuList(choice)).displayMenu(mainClient.getBankCard().getAccountList());break;
				
				case 5: choice = ((DisplayBalance)atm1.getMenuList(choice)).displayMenu(mainClient.getBankCard().getAccountList());break;
				
				case 6: choice = ((ChangePIN)atm1.getMenuList(choice)).changePin(mainClient);break;
			}
		}
	}

}
}
