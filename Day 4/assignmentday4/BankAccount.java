package assignmentday4;

public class BankAccount {

	private int accountId;
	private String accountHolderName;
	private double openingBalance;
	private double currentBalance;
	private static double totalBalance;
	AccountType type1 = AccountType.CURRENT;
	AccountType type2 = AccountType.SAVING;
	double minBal;

	public BankAccount(int accountId, String accountHolderName, double openingBalance, AccountType type) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.openingBalance = openingBalance;
		
		if(type1 == type) minBal = type1.minBalance();
		else if(type2 == type) minBal = type2.minBalance();
		
		if (openingBalance >= minBal) {
			this.currentBalance = openingBalance;
			totalBalance += openingBalance;
		} else {
			System.out.println("Customer registration not Possible for " + accountHolderName + " \n");
		}
	}

	void depositAmount(double amount) {
		if (openingBalance >= minBal) {
			if (amount > 0) {
				currentBalance += amount;
				totalBalance += amount;
				System.out.println("Amount Rs." + amount + " added to Account: " + accountId + "/" + accountHolderName + "\n");
			} else {
				System.out.println("Invalid Amount" + "\n");
			}
		}
	}

	void withdrawAmount(double amount) {
		if (openingBalance >= minBal) {
			if (amount > 0 && amount <= currentBalance - minBal) {
				currentBalance -= amount;
				totalBalance -= amount;
				System.out.println("Amount Rs." + amount + " withdrawn from Account: " + accountId + "/" + accountHolderName + "\n");
			} else {
				System.out.println("Insuffecient Account Balance to maintain Minimun Balance after Withdrawl" + "\n");
			}
		}
	}

	void currentBalance() {
		if (openingBalance >= minBal) {
			System.out.println("Account balance of Customer: " + accountId + "/" + accountHolderName + " is: Rs." + currentBalance + "\n");
		}
	}

	static void displayTotalBalance(String password) {
		if (password.contentEquals("admin")) {
			System.out.println("Current cash available in the bank is: Rs." + totalBalance + "\n");
		}
		else {
			System.out.println("Access Denied to Total Cash Balance of Bank \n");
		}
	}

	public static void main(String[] args) {
		BankAccount customer1 = new BankAccount(1001, "Parth", 1200, AccountType.CURRENT);
		BankAccount customer2 = new BankAccount(1002, "Disha", 500, AccountType.CURRENT);
		BankAccount customer3 = new BankAccount(1003, "Shivam", 1100, AccountType.SAVING);

		BankAccount.displayTotalBalance("admin");
		customer1.currentBalance();
		customer2.depositAmount(2000);
		customer1.withdrawAmount(300);
		customer3.depositAmount(100);
		customer3.currentBalance();
		BankAccount.displayTotalBalance("user");
		BankAccount.displayTotalBalance("admin");

	}

}
