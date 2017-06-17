package chapter_3;

import CtCILibrary.StackNode;

public class Q5_SortStack {

	public static void sortStack(StackNode<Integer> stack) {
		StackNode<Integer> sortStack = new StackNode<Integer>();
		
		while (!stack.isEmpty()) {
			int temp  = stack.pop();
			while (!sortStack.isEmpty() && temp < sortStack.peek()) {
				stack.push(sortStack.pop());
			}
			sortStack.push(temp);
		}
		
		while (!sortStack.isEmpty()) {
			stack.push(sortStack.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackNode<Integer> s = new StackNode<Integer>();
		s.push(4);
		s.push(6);
		s.push(1);
		s.push(2);
		s.push(5);
		s.push(3);
		sortStack(s);

		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	

	}

}
