package assignmentday6;

public enum AccountType {
	SAVING(4.5), CURRENT(3.0);
	private double interest;
	AccountType(double interest) {
		this.interest = interest;
	}
	double interest() {
		return this.interest;
	}

}
