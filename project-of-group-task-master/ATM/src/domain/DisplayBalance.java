package domain;

import java.util.ArrayList;

public class DisplayBalance implements Menu  {
		
	public DisplayBalance() {
		}

	@Override
	public int displayMenu(ArrayList<Account> accountList) {
		System.out.println("Your accounts balance:");
		for (int i = 0; i < accountList.size(); i++) {
			System.out.print("Your account " + accountList.get(i).getAccountID() );
			System.out.printf("       Balance: %.2f", accountList.get(i).getBalance());
			System.out.println();
		}
		System.out.println();
		System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
        return 1;
	}
}
