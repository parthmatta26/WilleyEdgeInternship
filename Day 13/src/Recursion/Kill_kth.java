package Recursion;

import java.util.Scanner;

public class Kill_kth {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		System.out.println("Survivor is: "+helper(n,k));
		sc.close();
	}
	public static int helper(int n,int k) {
		if(n==1)
			return 1;
		return (helper(n-1,k)+k-1)%n+1;
	}
}
