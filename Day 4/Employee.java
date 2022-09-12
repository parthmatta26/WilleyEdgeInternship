
public class Employee {
	private int empId;
	private String empName;
	private static int empCounter;
	
	public Employee(int empId, String empName) {
		empCounter++;
		this.empId = empId;
		this.empName = empName;
	}
	public static int employeeCounter() {
		return empCounter;
	}
	public void printDetails() {
		System.out.println(this.empId + " " + this.empName);
	}
}
