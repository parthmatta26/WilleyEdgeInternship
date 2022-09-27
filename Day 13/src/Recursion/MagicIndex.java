package Recursion;

import java.util.Scanner;

public class MagicIndex {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
          arr[i] = s.nextInt();
        }
        
		int ind = magicIndex(arr, 0);
		System.out.println(ind == -1 ? "No Magic Index Exists" : "First Magic Index is at " + ind);
		s.close();
	}

	static int magicIndex(int[] arr, int pos) {
		if(pos == arr.length) {
			return -1;
		}
		if(arr[pos] == pos) return pos;
		else return magicIndex(arr, pos+1);
	}
}
