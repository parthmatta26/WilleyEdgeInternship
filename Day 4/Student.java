
public class Student {
	int studentId;
	String studentName;
	Date doa;
	
	public Student(int studentId, String studentName, Date doa) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.doa = doa;
		
	}
	public void displayDetails() {
		System.out.println(studentId + " " + studentName + " " + doa.displayDate());
	}
	public static void main(String[] args) {
		Student s = new Student(100, "Parth", new Date(9,9,2022));
		s.displayDetails();
	}

}
