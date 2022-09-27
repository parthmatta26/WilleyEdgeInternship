package LinkedListandMap;

import java.util.HashSet;

public class LinkedList {
	Node head = null;
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(4);
		list.add(7);
		list.add(1);
		list.add(6);
		list.add(2);
		
		list.print();
		
		list.move();
		
		list.print();

	}
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		
	}
	public void move() {
		if(head == null || head.next == null) return;
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next.next = head;
		head = temp.next;
		temp.next = null;
		
		
	}
	public void add(int data) {
		Node n = new Node(data);
		if(head == null) {
			head = n;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	public void removeDuplicate() {
		HashSet<Integer> hs = new HashSet<>();
		Node temp = head;
		hs.add(temp.data);
		while(temp.next != null) {
			if(hs.contains(temp.next.data)) {
				temp.next = temp.next.next;
			}
			else {
				hs.add(temp.next.data);
				temp = temp.next;
			}
		}
	}

}
class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
