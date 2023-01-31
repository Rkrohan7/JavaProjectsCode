package bank;

import java.util.Scanner;

public class Operation {
	
	int Amount = 10;

	public void DepositeINR(int amt) {

		Amount = Amount + amt;
		System.out.println("Amount Deposited Successfully");
	}

	public void WithdrawINR(int amt) {
		if (amt > Amount) {
			throw new RuntimeException();
		}
		Amount = Amount - amt;
		System.out.println("Amount Withdrawn Successfully");
	}

	public void checkBalance() {
		System.out.println("Your Available Balance is: " + Amount);
	}

	public static void main(String[] args) {

		int amnt;
		char ch;
		System.out.println("Welcome to SBI Bank\n1.Deposit\n2.Withdraw\n3.Balance Enquiry\n4.Exit");
		System.out.println("Enter Your Choice");
		Operation Bank = new Operation();
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		do {

			switch (choice) {
			case 1:
				System.out.println("Enter Amount u want to deposit: ");
				amnt = sc.nextInt();
				Bank.DepositeINR(amnt);
				Bank.checkBalance();
				break;
			case 2:
				System.out.println("Enter Amount u want to withdraw: ");
				amnt = sc.nextInt();
				try {
					Bank.WithdrawINR(amnt);
					Bank.checkBalance();
				} catch (Exception e) {
					System.out.println(" Insufficient Fund....");
				}
				break;
			case 3:

				Bank.checkBalance();
				break;
			case 4:
				System.out.println("Thank You For visiting SBI");
				System.exit(0);

				break;

			default:
				System.out.println("Please enter correct choice...");
				break;
			}
			System.out.println("do you want to continue(y/n):");
			ch = sc.next().charAt(0);
			System.out.println("Welcome to SBI Bank\n1.Deposit\n2.Withdraw\n3.Balance Enquiry\n4.Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();

		} while (true);
	}

}
