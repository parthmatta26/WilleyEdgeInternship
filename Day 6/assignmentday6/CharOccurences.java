package assignmentday6;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurences {
	String word;
	int len;
	
	public CharOccurences(String word) {
		this.word = word;
		len = word.length();
	}

	private void countChar() {
		Map<Character, Integer> hm = new LinkedHashMap<>();
		
		for(int i = 0; i < len; i++) {
			char c = word.charAt(i);
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> ent : hm.entrySet()) {
			System.out.println("Character: " + ent.getKey() + " -> " + ent.getValue());
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		CharOccurences w1 = new CharOccurences("Parth Deep Matta");
		CharOccurences w2 = new CharOccurences("Hello World");

		w1.countChar();
		w2.countChar();
	}
}
