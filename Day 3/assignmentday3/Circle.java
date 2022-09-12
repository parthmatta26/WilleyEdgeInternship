package assignmentday3;

public class Circle {
	int radius;
	double area;
	
	public Circle() { }
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		area = Math.PI * radius * radius;
		return area;
	}
	
	public double calculateArea(int radius) {
		area = Math.PI * radius * radius;
		return area;
	}
	
	public static void main(String[] args) {
		Circle circle1 = new Circle(5); //Using Parameterized Constructor
		System.out.printf("%.2f\n",circle1.calculateArea());
		
		Circle circle2 = new Circle(); //Using Default Constructor
		System.out.printf("%.2f\n",circle2.calculateArea(12));
	}
}
