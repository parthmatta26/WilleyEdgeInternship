
public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "abc");
		Employee e2 = new Employee(102, "def");
		Employee e3 = new Employee(103, "ghi");
		
		System.out.println(Employee.employeeCounter());
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}

}
