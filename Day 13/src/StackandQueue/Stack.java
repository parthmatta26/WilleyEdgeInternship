package StackandQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(4);
		s.add(5);
		s.remove();
		s.add(8);
		s.add(9);
		s.add(2);
		
		int peek1 = s.peek();
		s.remove();
		int peek2 = s.peek();
		
		System.out.println(peek1 + " " + peek2);
	}

	int peek() {
		if(q1.isEmpty()) return -1;
		else return q1.peek();
	}

	int remove() {
		if(q1.isEmpty()) return -1;
		else return q1.remove();
		
	}

	void add(int i) {
		while(!q1.isEmpty()) 
			q2.add(q1.remove());
		
		q1.add(i);
		
		while(!q2.isEmpty()) 
			q1.add(q2.remove());
		
	}

}
