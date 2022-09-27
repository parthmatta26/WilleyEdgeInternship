package Arrays;

import java.util.Scanner;

public class ZeroRowColumn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < m; j++) {
        		arr[i][j] = s.nextInt();
        	}
        }
        boolean[][] vis = new boolean[n][m];
        
		int[][] zero = makeZero(arr, vis);
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < m; j++) {
        		System.out.print(zero[i][j] + " ");
        	}
        	System.out.println();
        }
        s.close();
	}

	static int[][] makeZero(int[][] arr, boolean[][] vis) {
		int n = arr.length;
		int m = arr[0].length;
		for(int i = 0; i < n; i++) {
        	for(int j = 0; j < m; j++) {
        		if(arr[i][j] == 0 && vis[i][j] == false) {
        			rczero(arr, i, j, vis, n, m);
        		}
        	}
        }
		return arr;
	}

	static void rczero(int[][] arr, int i, int j, boolean[][] vis, int n, int m) {
		vis[i][j] = true;
		for(int a = 0; a < n; a++) {
			if(arr[a][j] != 0) {
				arr[a][j] = 0;
				vis[a][j] = true;
			}
		}
		for(int b = 0; b < m; b++) {
			if(arr[i][b] != 0) {
				arr[i][b] = 0;
				vis[i][b] = true;
			}
		}
	}

}
