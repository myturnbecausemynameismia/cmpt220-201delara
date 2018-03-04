import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date(System.currentTimeMillis());
	
	Account(){}
	
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return (Date) dateCreated.clone();
	}
	
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = (annualInterestRate / 100.0) / 12;
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	public void withdraw(double amt) {
		balance -= amt;
	}
	
	public void deposit(double amt) {
		balance += amt;
	}	
	
}
