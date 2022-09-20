package assignmentday6;

public class BankAccount {

	private int accountId;
	private String accountHolderName;
	AccountType type1 = AccountType.CURRENT;
	AccountType type2 = AccountType.SAVING;
	double interest;

	public BankAccount(int accountId, String accountHolderName, AccountType type) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		
		if(type1 == type) interest = type1.interest();
		else if(type2 == type) interest = type2.interest();
		
	}

	void calculateTotalInterest(double amount, int years) throws DepositAmountException {
		if(amount < 0) {
			throw new DepositAmountException("The Amount is less than zero");
		}
		double rate = interest;
		double compound_interest = amount * (Math.pow((1 + rate / 100), years)) - amount;
		System.out.printf("%.2f\n" , compound_interest);
	}

	public static void main(String[] args) {
		BankAccount[] customer = new BankAccount[3];
		customer[0] = new BankAccount(1001, "Parth", AccountType.CURRENT);
		customer[1] = new BankAccount(1002, "Disha", AccountType.CURRENT);
		customer[2] = new BankAccount(1003, "Shivam", AccountType.SAVING);
		
		for(int i = 0; i < customer.length; i++) {
			try {
				customer[i].calculateTotalInterest((i+1)*1000 - 1000, ((i+1)*5)-3);
			}
			catch(DepositAmountException dae) {
				System.out.println(dae.getMessage());
			}
		}

	}

}
