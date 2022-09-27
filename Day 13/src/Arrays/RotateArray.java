package Arrays;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		arr[i][j] = s.nextInt();
        	}
        }
        
        int[][] rot = rotateArray(arr);
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		System.out.print(rot[i][j] + " ");
        	}
        	System.out.println();
        }
        s.close();
	}

	static int[][] rotateArray(int[][] arr) {
		int n = arr.length;
		int[][] rot = new int[n][n];
		for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		rot[i][j] = arr[j][n-i-1];
        	}
        }
		return rot;
	}
}
