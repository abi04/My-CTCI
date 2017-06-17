package chapter_2;

import CtCILibrary.LinkedListNode;

public class Q8_LoopDetection {

	public static LinkedListNode loopNode(LinkedListNode node1) {
		LinkedListNode slow = node1;
		LinkedListNode fast = node1;

		while (fast != null && fast.next != null) {
			if (fast == slow)
				break;
			slow = slow.next;
			fast = fast.next.next;

		}

		if (fast == null || fast.next == null)
			return null;

		slow = node1;

		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		return fast;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
