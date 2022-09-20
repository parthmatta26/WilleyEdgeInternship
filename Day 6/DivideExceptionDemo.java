
public class DivideExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			doDivide(a, b);
		}
		catch(ArithmeticException ae) {
			System.out.println("Can't Divide by 0");
		}
	}
	public static void doDivide(int a, int b) throws ArithmeticException{
		float result = a/b;
		System.out.println("Division result of "+ a +"/"+b +"= " +result);
	}
}