
public class SavingsAccount extends Account {
	
	public boolean canWithdraw(double amt) {
		return getBalance() > amt;
	}
	
//	@Override
//	public String toString() {
//		return super.toString() + "\nSavings Account";
//	}
}
