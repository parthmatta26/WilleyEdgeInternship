package assignmentday6;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println(reverse("Hello World"));
	}
	
	private static String reverse(String word) {
		String rev = "";
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			rev = c + rev;
		}
		return rev;
	}
}
