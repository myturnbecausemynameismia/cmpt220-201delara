
public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
		account.setId(1122);
		account.setBalance(20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("Account ID: " + account.getId() +
				"\nBalance: " + account.getBalance() +
				"\nMonthly Interest: " + account.getMonthlyInterest() +
				"\nDate Created: " + account.getDateCreated());
	}

}
