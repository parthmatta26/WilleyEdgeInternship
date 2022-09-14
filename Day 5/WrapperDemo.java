
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int->Integer
		 * double->Double
		 * char->character
		 * float->Float
		 * long->Long
		 * short->Short
		 */
		
		Integer i1=new Integer(10);
		
		//Boxing : Conversion of primitives into wrappers
		int x=20;
		Integer value=new Integer(x);
		
		
		//UnBoxing : conversion of wrappers into Primitives
		int ans=value.intValue();
		
		checkValue(ans);
	}

	private static void checkValue(Double ans) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	

}
