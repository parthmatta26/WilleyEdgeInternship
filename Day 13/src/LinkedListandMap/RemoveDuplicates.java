package LinkedListandMap;

public class RemoveDuplicates {
	Node head = null;
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(7);
		
		list.print();
		
		list.removeDuplicate();
		
		list.print();

	}
	
}
