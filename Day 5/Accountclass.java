
public class Accountclass implements MarkerInterface {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c=Class.forName("Account");
		System.out.println(c.getName());
		
		@SuppressWarnings("rawtypes")
		Class[] interfaces=c.getInterfaces();
		System.out.println("Interfaces implemented : ");
		System.out.println(c.getSuperclass().getName());
		
		for(Class<?> class1: interfaces) {
			if(class1.getName().equals("MyMarkerInterface1"))
				System.out.println("You are eligible for this process");
		}
		
		
	}
}
