
public class CheckingAccount extends Account {
	private double overdraftLimit;

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public boolean canWithdraw(double amt) {
		return getBalance() + overdraftLimit > amt;
	}
	
//	@Override
//	public String toString() {
//		return super.toString() + "\nOverdraft Limit: " + 
//	overdraftLimit + "\nChecking Account";
//	}
}
