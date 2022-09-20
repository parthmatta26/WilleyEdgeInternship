package assignmentday6;

public class Arrayelementcheck {

	public static void main(String[] args) {
		String[] arr1 = new String[6];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = "" + (char) (i+97);
		}
		
		String[] arr2 = new String[3];
		arr2[0] = "Parth";
		arr2[1] = "Matta";
		arr2[2] = "Parth";
		
		String[] arr3 = new String[5];
		arr3[0] = "abc";
		arr3[1] = "def";
		arr3[2] = "ghi";
		arr3[3] = "def";
		arr3[4] = "abc";
		
		validate(arr1);
		validate(arr2);
		validate(arr3);
	}

	private static void validate(String[] arr) {
		int n = arr.length-1;
		if(n >= 4) {
			if(arr[0].equals(arr[n]))
				System.out.println("Elements are Same");
			else
				System.out.println("Elements are Different");
		}
		else {
			System.out.println("Array Size is less that 5");
		}
		
	}

}
