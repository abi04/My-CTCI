package chapter_3;

import CtCILibrary.QueueStack;

public class Q4_QueueWithStacks {

	
	public static void main(String[] args){
		QueueStack<Integer> queue = new QueueStack<Integer>();
			queue.add(1);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			queue.add(6);
			
			System.out.println(queue.peek());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.peek());
	}
}
