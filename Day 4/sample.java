
public class sample implements Interface1, Interface2{

	public static void main(String[] args) {
		sample s = new sample();
		s.print();

	}

	@Override
	public void print() {
		System.out.println("Hello");
		
	}
}
