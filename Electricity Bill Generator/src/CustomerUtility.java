import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerUtility {
	private static int customerId;;
	private static String customerName;
	private static int customerAreaCode;
	private static int numberofUnitsConsumed;
	private static Map<Integer, Customer> hm = new HashMap<>();

	public static void registerCustomer() {
		Scanner sc = new Scanner(System.in);
		String ans = "Y";
		do {
			try {
				System.out.println("\nEnter Customer Details");
				System.out.print("Customer ID: ");
				customerId = sc.nextInt();
				System.out.print("Customer Name: ");
				customerName = sc.next();
				System.out.print("Customer Area Code: ");
				customerAreaCode = sc.nextInt();
				System.out.print("Number of Units of Electricity Consumed: ");
				numberofUnitsConsumed = sc.nextInt();
				if(numberofUnitsConsumed < 0) throw new InvalidInputException("Invalid Input");
				hm.put(customerId, new Customer(customerId, customerName, customerAreaCode, numberofUnitsConsumed));
			}catch (InvalidInputException ie) {
				System.out.println(ie.getMessage());
			}
			try {
				System.out.print("\nWould you like to register another Customer (Y/N): ");
				ans = sc.next();
				if (ans.equalsIgnoreCase("N"))
					break;
				else if (ans.equalsIgnoreCase("Y"))
					continue;
				else
					throw new InvalidInputException("Invalid Input");
			} catch (InvalidInputException ie) {
				System.out.println(ie.getMessage());
				break;
			}
		} while (ans.equalsIgnoreCase("Y"));
		int a = 1;
		if(a < 0) sc.close();
	}

	public static void generateBill() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Specific Customer ID (or Enter 0 to generate all bills): ");
		customerId = sc.nextInt();
		if (customerId != 0) {
			if (hm.containsKey(customerId)) {
				Customer c = hm.get(customerId);
				System.out.println(c);
				System.out.println("The Total electicity Bill is: " + c.calculateTotalBill());
			} else {
				System.out.print("\nID not Registered!");
			}
		} else {
			for (Map.Entry<Integer, Customer> a : hm.entrySet()) {
				Customer c = a.getValue();
				System.out.println(c);
				System.out.println("The Total electicity Bill is: " + c.calculateTotalBill());
			}
		}
		int a = 1;
		if(a < 0) sc.close();
	}

	public static void sortCustomers() {
		List<Customer> list = new LinkedList<>();
		for (Map.Entry<Integer, Customer> a : hm.entrySet()) {
			list.add(a.getValue());
		}
		Collections.sort(list, new Comparator<Customer>() {
			public int compare(Customer o1, Customer o2) {
				if (o1.getTotalBill() > o2.getTotalBill())
					return 1;
				return -1;
			}
		});
		for (Customer a : list) {
			System.out.println(a);
		}
	}

	public static void filterByAreaCode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Area Code: ");
		customerAreaCode = sc.nextInt();
		hm.entrySet().stream().filter(e -> e.getValue().getCustomerAreaCode() == customerAreaCode)
				.forEach(System.out::println);
		int a = 1;
		if(a < 0) sc.close();
	}

	public static void groupByAreaCode() {
		List<Customer> list = new LinkedList<>();
		for (Map.Entry<Integer, Customer> a : hm.entrySet()) {
			list.add(a.getValue());
		}
		HashMap<String, List<Customer>> areacode = new HashMap<>();
		for (Customer a : list) {
			String key = ((Integer) a.getCustomerAreaCode()).toString();
			areacode.putIfAbsent(key, new ArrayList<Customer>());
			areacode.get(key).add(a);
		}
		System.out.println(areacode);

	}

	public static void serializeAllCustomers() {
		try (FileOutputStream fos = new FileOutputStream("customers.dat");) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hm);
			System.out.println("Objects serialized!!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void deserializeAllCustomers() {
		try (FileInputStream fis = new FileInputStream("customers.dat");) {
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			Map<Integer, Customer> deserial = (Map<Integer, Customer>) ois.readObject();
			System.out.println("List of customers obtained after deserialization:");
			for (Map.Entry<Integer, Customer> a : deserial.entrySet()) {
				Customer c = a.getValue();
				System.out.println(c);
			}
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
