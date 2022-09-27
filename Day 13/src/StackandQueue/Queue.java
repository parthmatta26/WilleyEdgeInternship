package StackandQueue;

import java.util.Stack;

public class Queue {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(4);
		q.add(5);
		q.remove();
		q.add(8);
		q.add(9);
		q.add(2);
		
		int peek1 = q.peek();
		q.remove();
		int peek2 = q.peek();
		
		System.out.println(peek1 + " " + peek2);
	}

	int peek() {
		if(s2.isEmpty()) return -1;
		else return s2.peek();
	}

	int remove() {
		if(s2.isEmpty()) return -1;
		else return s2.pop();
		
	}

	void add(int i) {
		while(!s2.isEmpty()) 
			s1.push(s2.pop());
		
		s1.push(i);
		
		while(!s1.isEmpty()) 
			s2.push(s1.pop());
		
	}

}
