import java.util.Scanner;

public class CustomerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Electricity Bill Generator App\n******************************************");
	
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Register Customer");
			System.out.println("2. Generate Bill");
			System.out.println("3. Customer Database");
			System.out.println("4. Customer Locator");
			System.out.println("5. Group By Area Code");
			System.out.println("6. Serialize Data");
			System.out.println("7. Deserialize Data");
			System.out.println("0. Exit");
			System.out.print("Please select an option to proceed: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				CustomerUtility.registerCustomer();
				break;
			case 2:
				CustomerUtility.generateBill();
				break;
			case 3:
				CustomerUtility.sortCustomers();
				break;
			case 4:
				CustomerUtility.filterByAreaCode();
				break;
			case 5:
				CustomerUtility.groupByAreaCode();
			case 6:
				CustomerUtility.serializeAllCustomers();
				break;
			case 7:
				CustomerUtility.deserializeAllCustomers();
				break;
			case 0:
				continue;
			default:
				System.out.println("\nInvalid Input Try Again");
				continue;
			}
			try {
				System.out.print("\nWould you like to use another service (Y/N): ");
				String ans = sc.next();
				if(ans.equalsIgnoreCase("N")) break;
				else if(ans.equalsIgnoreCase("Y")) continue;
				else throw new InvalidInputException("Invalid Input");
			}
			catch(InvalidInputException ie) {
				System.out.println(ie.getMessage());
				break;
			}
		}while(choice != 0);
		sc.close();
		System.out.println("******************************************\nThank You for using our service, Have a nice Day!");
	}

}
