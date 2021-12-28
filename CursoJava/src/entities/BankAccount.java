package entities;

public class BankAccount {
	private String personName;
	private int numberAccount;
	private double amount;
	
	public BankAccount() {
   //this constructor is empty
 }
	public BankAccount(String name, int numberAccount, double initialDeposit) {
		   this.personName = name;
		   this.numberAccount = numberAccount;
		   deposit(initialDeposit);
		 }
	public BankAccount(String name, int number) {
		   this.personName = name;
		   this.numberAccount = number;
		 }

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public double getAmount() {
		return amount;
	}
	
	public void deposit(double value) {
		this.amount += value;
		
	}
	public void withdraw(double value) {
		 final double bankTax = 5.00;
		this.amount -= value + bankTax;
	}
	
	public String toString() {
		return "Account Bank X" + "\n" 
				+ "Account number: " + this.numberAccount + "\n"
				+ "Owner: " + this.personName + "\n"
				+ "Amount: " + String.format("%.2f",this.amount);
	}
	
}
