
public class AccountTests {

	public static void main(String[] args) {
		//savings
		SavingsAccount savings = new SavingsAccount();
		savings.setId(0001);
		savings.setBalance(100);
		savings.setAnnualInterestRate(.06);
		
		System.out.println("This is our savings account.");
		printAll(savings);
		
		System.out.println("\nCan we withdraw $500 from savings? " + savings.canWithdraw(500));
		if(savings.canWithdraw(500))
			savings.withdraw(500);
		System.out.println("Therefore, ");
		printAll(savings);
		
		System.out.println("\nLet's deposit $20. This is our savings account now.");
		savings.deposit(20);
		printAll(savings);
		
		//checking
		CheckingAccount checking = new CheckingAccount();
		checking.setId(0002);
		checking.setBalance(68);
		checking.setAnnualInterestRate(4.5);
		checking.setOverdraftLimit(50);
		
		System.out.println("\n\nThis is our checking account.");
		printAll(checking);
		
		System.out.println("Can we withdraw $100? " + checking.canWithdraw(100));
		System.out.println("Therefore, ");
		if(checking.canWithdraw(100))
			checking.withdraw(100);
		printAll(checking);
		
		System.out.println("\nCan we withdraw $500? " + checking.canWithdraw(500));
		System.out.println("Therefore, ");
		if(checking.canWithdraw(500))
			checking.withdraw(500);
		printAll(checking);
		
		System.out.println("\nLet's deposit $5. This is our account now.");
		checking.deposit(5);
		printAll(checking);
	}
	
	public static void printAll(Account account) {
		System.out.println("Account ID: " + account.getId() +
				"\nBalance: " + account.getBalance() +
				"\nMonthly Interest: " + account.getMonthlyInterest() +
				"\nDate Created: " + account.getDateCreated());
		
		if(account instanceof CheckingAccount) {
			CheckingAccount acc = (CheckingAccount) account;
			System.out.println("Overdraft Limit: " + acc.getOverdraftLimit());
		}
		
	}

}
