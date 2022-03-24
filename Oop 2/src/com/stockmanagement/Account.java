package com.stockmanagement;

import java.util.Scanner;

public class Account {
	void testDebit(int debitAmount, StockManagement account) {
		if(account.getBalance()<0) {
			System.out.println("Debit amount is exceeding the account balance");
			account.depositMoney(debitAmount);
			System.out.println("The current account balance is Rs." + account.getBalance());
		}
		else {
			System.out.println("Amount withdrawn is Rs." + debitAmount );
			System.out.println("The current Account balance is Rs." + account.getBalance());
		}
	}

	public static void main(String[] args) {
		StockManagement account = new StockManagement();
		Account accountTest = new Account();

		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter (0/1) to deposit or withdraw the money respectively..Press 2 to stop :");
			int response = scan.nextInt();
			if(response == 0) {
				System.out.println("Enter the Deposit Amount :");
				int deposit = scan.nextInt();
				account.depositMoney(deposit);
			}
			
			else if(response == 1) {
				System.out.println("Enter the withdrawl Amount :");
				int withdrawl = scan.nextInt();
				account.withdrawMoney(withdrawl);
				accountTest.testDebit(withdrawl, account);
			}
			
			else if(response == 2) {
				System.out.println("Transaction complete");
				break;
			}
			
			else {
				System.out.println("Enter valid command");
			}
		}
	}
}
