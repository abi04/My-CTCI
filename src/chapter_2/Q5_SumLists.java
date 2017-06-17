package chapter_2;

import java.util.LinkedList;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Q5_SumLists {

	public static LinkedListNode sumLists(LinkedListNode node1, LinkedListNode node2, int count) {
		

		LinkedListNode result = new LinkedListNode();

		if (node1 == null && node2 == null && count == 0)
			return null;

		int value = count;
		if (node1 != null)
			value += node1.data;
		if (node2 != null)
			value += node2.data;

		result.data = value > 9 ? value % 10 : value;

		result.next = sumLists(node1 != null ? node1.next : null, node2 != null ? node2.next : null, value > 9 ? 1 : 0);

		return result;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode node1 = AssortedMethods.randomLinkedList(5, 1, 9);
		LinkedListNode node2 = AssortedMethods.randomLinkedList(3, 1, 9);
		LinkedListNode current = node1;
		AssortedMethods.displayNode(current);
		current = node2;
		AssortedMethods.displayNode(current);
		current = sumLists(node1, node2, 0);
		AssortedMethods.displayNode(current);

	}

}
