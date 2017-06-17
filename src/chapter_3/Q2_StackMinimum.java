package chapter_3;

import CtCILibrary.StackNodeMin;

public class Q2_StackMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackNodeMin stack = new StackNodeMin();
		stack.push(2);
		stack.push(4);
		stack.push(5);
		stack.push(2);
		stack.push(3);
		stack.push(1);
		int count =8;
		while (--count != 3){
			System.out.print(stack.min());
			System.out.print("\t" +stack.pop());
			System.out.println("\n");
		}
	}

}
