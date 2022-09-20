package assignmentday6;

import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {
	String first;
	String second;
	
	public AnagramStrings(String first, String second) {
		this.first = first;
		this.second = second;
	}

	boolean validate() {
		Map<Character, Integer> hm1 = new HashMap<>();
		Map<Character, Integer> hm2 = new HashMap<>();
		
		for(int i = 0; i < first.length(); i++) {
			char c = first.charAt(i);
			hm1.put(c, hm1.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i < second.length(); i++) {
			char c = second.charAt(i);
			hm2.put(c, hm2.getOrDefault(c, 0) + 1);
		}
		
		if(hm1.equals(hm2))
			return true;
		return false;
	}
	public static void main(String[] args) {
		AnagramStrings as1 = new AnagramStrings("listen", "silent");
		AnagramStrings as2 = new AnagramStrings("triangle", "integral");
		AnagramStrings as3 = new AnagramStrings("parth", "matta");
		
		System.out.println(as1.validate());
		System.out.println(as2.validate());
		System.out.println(as3.validate());
	}
}
