package StackandQueue;

import java.util.Scanner;

public class Island {
	static int count = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
        int map[][] = new int[m][n];
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		map[i][j] = s.nextInt();
        	}
        }
        countIslands(map);
        System.out.println(count);
        s.close();   
	}

	static void countIslands(int[][] map) {
		int m = map.length;
		int n = map[0].length;
		for(int i = 1; i < m-1; i++) {
        	for(int j = 1; j < n-1; j++) {
        		if(map[i][j] == 1 && isIsland(i, j, map)) count++;
        	}
        }
	}

	static boolean isIsland(int i, int j, int[][] map) {
		if(map[i-1][j] == 0 && map[i+1][j] == 0 && map[i][j-1] == 0 && map[i][j+1] == 0 && map[i-1][j-1] == 0 && map[i+1][j-1] == 0 && map[i-1][j+1] == 0 && map[i+1][j+1] == 0) return true;
		return false;
	}
}
