package assignmentday6;

import java.util.Arrays;

public class Employee {
	private int empId;
	private String empName;
	private address[] empAddress;
	
	public Employee(int empId, String empName, address[] empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = Arrays.copyOf(empAddress, 2);
	}
	
	void displayAttributes() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName + "\n");
		System.out.println("Employee temporary address \n" + empAddress[0] + "\n");
		System.out.println("Employee permanenet address \n" + empAddress[1]);
		
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Parth", new address[] {new address(25, "A", "Some road", "Delhi"), new address(36, "C", "New road", "Mumbai")});
		e1.displayAttributes();
	}
}
