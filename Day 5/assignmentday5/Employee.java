package assignmentday5;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {
	private int empId;
	private String empName;
	private String empDept;
	private double empBasicSalary;
	private double empGrossSalary;
	
	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}
	
	public double calculateGrossSalary() {
		this.empGrossSalary = this.empBasicSalary * 1.2;
		return this.empGrossSalary;
	}
	

	static void searchEmployees(Employee[] emp, String string) {
		System.out.println("The Employees of " + string + " department are:");
		for(Employee e : emp) {
			if(e.empDept.contentEquals(string)) {
				System.out.println(e.empId + " " + e.empName + " " + e.empDept);
			}
		}
	}
	
	@Override
	public boolean equals(Object o) {
		Employee e = (Employee)o; //downcasting
		if(this.empId == e.empId && this.empName == e.empName) return true;
		return false;
	}

	@Override
	public String toString() {
		return this.empId + " " + this.empName + " " + this.empDept + " " + this.empGrossSalary;
	}

	public static void sortEmployees(Employee[] emp) {
		Arrays.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2)
            {
                if (e1.calculateGrossSalary() > e2.calculateGrossSalary()) {
                    return -11;
                }
                return 1;
            }
        });
		for(Employee e : emp) {
			System.out.println(e);
		}
		System.out.println();
	}
}
