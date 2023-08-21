package EncapsulationAcessModifier;

public class BankAccount {
	String customerName;
	int accountNumber;
	int balance;
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		BankAccount bank=new BankAccount();
		bank.setCustomerName("Anjali");
		bank.setAccountNumber(45566);
		bank.setBalance(4567);
		System.out.println("Name: "+bank.getCustomerName());
		System.out.println("Account Namer:"+bank.getAccountNumber());
		System.out.println("Balance: "+bank.getBalance());
	}

}
