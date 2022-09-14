
public class Employee implements Cloneable{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj; //downcasting
		if(this.empId == e.empId) return true;
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.empId + "/" + this.empName;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Parth");
		Employee e2 = new Employee(101, "Parth");
		
		System.out.println(e1);
		System.out.println(e2.toString());

		if(e1.equals(e2)) System.out.println(true);
		else System.out.println();
	}

}
