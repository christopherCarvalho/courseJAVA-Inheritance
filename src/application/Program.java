package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new SavingsAccount("Alex", 1001, 1000.0,0.01);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new BusinessAccount("Maria", 1002,1000.0,500.0);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new Account("Bob", 1003,1000.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

	}

}
