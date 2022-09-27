package StackandQueue;

import java.util.Scanner;
import java.util.Stack;

public class Curlybraces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String braces = sc.next();
		
		boolean result = matchBraces(braces);
		System.out.println(result);
		sc.close();
	}

	static boolean matchBraces(String braces) {
		int n = braces.length();
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < n; i++) {
			char c = braces.charAt(i);
			if(c == '{') {
				st.push('{');
			}
			else {
				if(st.isEmpty()) return false;
				else st.pop();
			}
		}
		if(st.isEmpty())
			return true;
		else 
			return false;
	}

}
