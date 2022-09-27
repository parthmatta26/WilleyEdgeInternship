package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintCurly {
	static List<String> list = new ArrayList<>();
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		helper(0,0,n,"");
		System.out.print(list);
		sc.close();
	}
	public static void helper(int open,int closed,int n,String s) {
		if(open==n && closed==n)
		{
			list.add(s);
			return;
		}
		
		if(closed<open) {
			if(open!=n)
			helper(open+1,closed,n,s+"{");
			helper(open,closed+1,n,s+"}");
		}
		else
			helper(open+1,closed,n,s+"{");
	}
}
