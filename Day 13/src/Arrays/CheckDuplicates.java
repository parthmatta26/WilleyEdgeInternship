package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CheckDuplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
          arr[i] = s.nextInt();
        }
        
      //solution1
        System.out.println(sol1(arr) == true ? "No Duplicates" : "Duplicates Exist");
        
      //solution2
        System.out.println(sol2(arr) == true ? "No Duplicates" : "Duplicates Exist");
        
      //solution3
        System.out.println(sol3(arr) == true ? "No Duplicates" : "Duplicates Exist");
        s.close();
	}

	private static boolean sol1(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int c = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] == c) return false;
			}
		}
		return true;
	}

	private static boolean sol2(int[] arr) {
		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i-1]) return false;
		}
		return true;
	}

	private static boolean sol3(int[] arr) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < arr.length; i++) {
			if(hs.contains(arr[i])) return false;
			hs.add(arr[i]);
		}
		return true;
	}

}
