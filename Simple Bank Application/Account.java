package bank_application;

import java.util.Scanner;

public class Account {

//	Class Variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;

//	Class constructor
	Account(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}

//	Function for depositing money
	void deposit(int amount) {
		if (amount != 0) {
			balance += amount;
			previousTransaction = amount;
		}
	}

//	Function for Withdrawing money
	void withdraw(int amount) {
		if (amount != 0) {
			balance -= amount;
			previousTransaction = -amount;
		}
	}

//		Function showing the previous transaction
	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else {
			if (previousTransaction < 0) {
				System.out.println("Withdrawn: " + Math.abs(previousTransaction));
			} else {
				System.out.println("No transaction occurred");
			}
		}
	}

//		Function calculating interest of current funds after a number of years
	void calculateInterest(int years) {
		double interestRate = 0.04;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interest rate is " + (100 * interestRate) + "%");
		System.out.println("After " + years + " years, you balance will be: " + newBalance);
	}
	
//	Function showing the main menu
	void showMenu() {
		char option = '\0';
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Welcome, " + customerName + "!");
		System.out.println("Your ID is: " + customerID);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest");
		System.out.println("F. Exit");
		
		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			
			switch(option) {
//			Case 'A' allows the user to check their account balance
			case 'A':
				System.out.println("=======================================");
				System.out.println("Balance = Rs " + balance);
				System.out.println("=======================================");
				System.out.println();
				break;
				
//				Case 'B' allows the user to deposit money into their account
			case 'B':
				System.out.println("Enter an amount to deposit: ");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println();
				break;
				
//				Case 'C' allows the user to withdraw money from their account 
			case 'C':
				System.out.println("Enter an amount to withdraw: ");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println();
				break;
				
//				Case 'D' allows the user to view their most recent transaction
			case 'D':
				System.out.println("=======================================");
				getPreviousTransaction();;
				System.out.println("=======================================");
				System.out.println();
				break;
				
//				Case 'E' calculates the accrued interest on the account 
			case 'E':
				System.out.println("Enter how many years of accrued interset: ");
				int years = scanner.nextInt();
				calculateInterest(years);
				break;
				
//				Case 'F' exits the user from their account
			case 'F':
				System.out.println("=======================================");
				break;
				
//				The default case let's the user know that they entered an invalid input
				default: 
					System.out.println("Error: invalid option. Please enter A, B, C, D, E, or F");
					break;
			}
		} while (option != 'F');
		System.out.println("Thank you for banking with us !");
	}
}





