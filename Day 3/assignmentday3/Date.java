package assignmentday3;

public class Date {
	int dd;
	int mm;
	int yy;
	
	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public String displayDate() {
		return dd+"/"+mm+"/"+yy;
	}
	
	public boolean checkDate() {
		if(dd > 31 || mm > 12 || dd < 1 || mm < 1 || yy < 1) return false;
		if(dd == 31) {
			if((mm < 7 && mm%2 == 0) || mm == 9 || mm == 11) return false;
		}
		if(mm == 2) {
			if(!isLeap(yy)) {
				if(dd > 28) return false;
			}
			else {
				if(dd > 29) return false;
			}
		}
		return true;
	}
	
	private boolean isLeap(int yy) {
		if(yy%4 == 0) {
			if(yy%100 == 0) {
				if(yy%400 == 0) return true;
				else return false;
			}
			else return true;
		}
		else return false;
	}

	public static void main(String[] args) {
		Date date1 = new Date(26, 9, 1999);
		if(date1.checkDate()) System.out.println(date1.displayDate());
		else System.out.println("Invalid Date");
		
		Date date2 = new Date(31, 4, 2015);
		if(date2.checkDate()) System.out.println(date2.displayDate());
		else System.out.println("Invalid Date");
		
		Date date3 = new Date(29, 2, 2017);
		if(date3.checkDate()) System.out.println(date3.displayDate());
		else System.out.println("Invalid Date");
		
		Date date4 = new Date(29, 2, 2020);
		if(date4.checkDate()) System.out.println(date4.displayDate());
		else System.out.println("Invalid Date");
	}

}
