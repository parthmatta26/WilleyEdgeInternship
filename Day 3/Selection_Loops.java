
public class Selection_Loops {

	public static void main(String[] args) {
		
		Selection_Loops sl = new Selection_Loops();
		//If-else Statement
		System.out.println(sl.ifStatement(10, 20));
		//Switch Statement
		System.out.println(sl.switchStatement(10, 5, '*'));
		//For Loop with continue
		sl.forLoop(4, 2);
		//While Loop with break;
		sl.whileLoop(5);
	}

	private void whileLoop(int i) {
		int x = 1;
		while(true) {
			System.out.println("Hello");
			x++;
			if(x == i) break;
		}
	}

	private void forLoop(int i, int j) {
		char c = '*';
		for(int x = 1; x <= i; x++) {
			if(x == j) continue;
			for(int y = 1; y <= x; y++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	private int switchStatement(int i, int j, char c) {
		switch (c) {
		case '+' :
			return i+j;
		case '-' :
			return i-j;
		case '*' :
			return i*j;
		case '/' :
			return i/j;
		}
		return 0;
	}

	private int ifStatement(int i, int j) {
		if(i > j) return i;
		else return j;
	}

}
