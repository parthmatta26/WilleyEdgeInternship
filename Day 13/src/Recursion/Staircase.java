package Recursion;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		count = steps(n, 0, count);
		System.out.println("All the posibilities of climbing the stairs: " + count);
		s.close();
	}

	static int steps(int total, int st, int c) {
		if(st == total) {
			c = c+1;
			return c;
		}
		int x = 0;
		if(validpos(st+3, total)) {
			x += steps(total, st+3, c);
		}
		if(validpos(st+2, total)) {
			x += steps(total, st+2, c);
		}
		if(validpos(st+1, total)) {
			x += steps(total, st+1, c);
		}
		
		return x;
	}

	static boolean validpos(int st, int total) {
		if(st > total) return false;	
		return true;
	}
}
