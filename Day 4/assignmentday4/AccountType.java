package assignmentday4;

public enum AccountType {
	SAVING(500), CURRENT(1000);
	private double minBal;
	AccountType(double minBal) {
		this.minBal = minBal;
	}
	double minBalance() {
		return this.minBal;
	}
}
