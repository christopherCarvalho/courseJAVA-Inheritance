package entities;

public class Account {
	private String holder;
	private Integer number;
	protected Double taxAccount = 5.0;
	protected Double balance;
	
	
	public Account() {		
	}

	public Account(String holder, Integer number, Double balance) {
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getBalance() {
		return balance;
	}	

	public Double getTaxAccount() {
		return taxAccount;
	}

	public void setTaxAccount(Double taxAccount) {
		this.taxAccount = taxAccount;
	}
	
	public void withdraw(double amount)	{
		if(balance >= amount){
			balance -= amount + taxAccount;
		}
		else {
			System.out.print("Insuficient balance.");
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	
}
