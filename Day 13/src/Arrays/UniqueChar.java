package Arrays;

import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int[] freq = new int[65535];
		int flag = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			freq[c] += 1;
			if(c != ' ' && freq[c] > 1) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("String does not contain Unique Characters");
		}
		else {
			System.out.println("String contains Unique Characters");
		}
		s.close();
	}

}
