package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	private Double tax = 10.0;	
	private Double businessTax = 2.0;
	

	public BusinessAccount() {		
		super();
	}

	public BusinessAccount(String holder, Integer number, Double balance, Double loanLimit) {
		super(holder, number, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - tax;
		}
	}
	
	public void withdraw(double amount)	{
		if(balance >= amount){
			super.withdraw(amount);
			balance -= businessTax;
		}
		else {
			System.out.print("Insuficient balance.");
		}
	}
	
	public Double getBusinessTax() {
		return businessTax;
	}

	public void setBusinessTax(Double businessTax) {
		this.businessTax = businessTax;
	}
}
