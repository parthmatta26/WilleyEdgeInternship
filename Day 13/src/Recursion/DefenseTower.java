package Recursion;

public class DefenseTower {
	public static void main(String[] args) {
		int[][] empire = new int[5][5];
		int count = 0;
		count = defense(empire, 0, count);
		System.out.println("All the posibilities of building the defense towers in the empire are: " + count);
	}

	static int defense(int[][] empire, int row, int c) {
		if(row == 5) {
			c = c+1;
			return c;
		}
		int x = 0;
		for(int i = 0; i < 5; i++) {
			if(validpos(empire, row, i)) {
				empire[row][i] = 1;
				x += defense(empire, row+1, c);
			}
			empire[row][i] = 0;
		}
		return x;
	}

	static boolean validpos(int[][] empire, int row, int i) {
		for(int j = 0; j < row; j++) {
			if(empire[j][i] == 1) return false;
		}
		return true;
	}
}
