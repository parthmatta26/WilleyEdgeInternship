package assignmentday3;

public class Fibonnaci_Series {
	int size;
	int start;
	
	public Fibonnaci_Series(int start, int size) {
		this.start = start;
		this.size = size;
	}
	
	public Fibonnaci_Series(int size) {
		this.start = 1;
		this.size = size;
	}
	
	public void printSeries() {
		int prev = 0;
		int sum = 1;
		int count = 1;
		while(count < size+start) {
			if(count >= start) System.out.print(sum + " ");
			sum += prev;
			prev = sum;
			count++;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Fibonnaci_Series fs1 = new Fibonnaci_Series(8); //Constructor with default start value
		fs1.printSeries();
		
		Fibonnaci_Series fs2 = new Fibonnaci_Series(4, 4); //Constructor with specified start value
		fs2.printSeries();
	}

}
