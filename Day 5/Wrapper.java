
public class Wrapper {

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
		int i2 = 10;
		System.out.println(i1.equals(i2));
		
		//Boxing : Conversion of primitives into wrappers
		int x=20;
		Integer value=new Integer(x);
		
		
		//UnBoxing : conversion of wrappers into Primitives
		int ans=value.intValue();
		
		checkValue(ans);
	}

	private static void checkValue(Integer ans) {
		System.out.println(ans.hashCode());
		System.out.println(ans.intValue());		
	}

}
