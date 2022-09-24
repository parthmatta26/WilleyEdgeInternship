import java.io.Serializable;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int customerId;;
	private String customerName;
	private int customerAreaCode;
	private int numberofUnitsConsumed;
	private double totalBill;
	
	public Customer(int customerId, String customerName, int customerAreaCode, int numberofUnitsConsumed) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAreaCode = customerAreaCode;
		this.numberofUnitsConsumed = numberofUnitsConsumed;
	}
	
	public int getCustomerAreaCode() {
		return customerAreaCode;
	}
	
	public double getTotalBill() {
		return totalBill;
	}

	double calculateTotalBill() {
		if(numberofUnitsConsumed > 150) {
			totalBill = 100*0.5 + 50*0.75 + (numberofUnitsConsumed - 150)*1;
		}
		else if(numberofUnitsConsumed > 100) {
			totalBill = 100*0.5 + (numberofUnitsConsumed - 150)*0.75;
		}
		else {
			totalBill = numberofUnitsConsumed*0.5;
		}
		return totalBill;
	}

	@Override
	public String toString() {
		return "\nCustomer Id: " + customerId + "\n" + "Customer Name: " + customerName + "\n" + "Customer Area Code: " + customerAreaCode + "\n" + "Number of Units Consumed: " + numberofUnitsConsumed + "\n";
	}
}
