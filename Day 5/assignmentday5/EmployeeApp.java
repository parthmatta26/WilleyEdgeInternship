package assignmentday5;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee[] emp = new Employee[5];
		emp[0] = new Employee(101, "A", "Dev", 50000);
		emp[1] = new Employee(102, "B", "HR", 32000);
		emp[2] = new Employee(103, "C", "Dev", 41000);
		emp[3] = new Employee(104, "D", "Dev", 78000);
		emp[4] = new Employee(105, "E", "HR", 36000);
		
		Employee.sortEmployees(emp);
		Employee.searchEmployees(emp, "HR");
		
		Employee e1 = new Employee(101, "A", "Dev", 60000);
		Employee e2 = new Employee(101, "A", "HR", 45000);
		System.out.println("Overiding Equals method gives : " + e1.equals(e2));
	}

}
