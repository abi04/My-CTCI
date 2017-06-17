package chapter_2;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Q7_Intersectionll {

	static class Result {
		public LinkedListNode node;
		public int size;

		public Result(LinkedListNode node1, int size1) {
			this.node = node1;
			this.size = size1;
		}
	}

	public static LinkedListNode intersectNode(LinkedListNode node1, LinkedListNode node2) {

		Result result1 = getTail(node1);
		Result result2 = getTail(node2);
		if (result1.node != result2.node)
			return null;

		int difference = Math.abs(result1.size - result2.size);

		LinkedListNode longerNode = result1.size > result2.size ? node1 : node2;
		LinkedListNode ShorterNode = result1.size > result2.size ? node2 : node1;

		while (--difference != 0 & longerNode != null) {
			longerNode = longerNode.next;
		}

		while (ShorterNode != longerNode) {
			ShorterNode = ShorterNode.next;
			longerNode = longerNode.next;
		}

		return longerNode;

	}

	public static Result getTail(LinkedListNode node) {

		int size = 1;
		while (node.next != null) {
			size++;
			node = node.next;
		}
		return new Result(node, size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode node1 = AssortedMethods.randomLinkedList(10, 1, 9);
		LinkedListNode node2 = AssortedMethods.randomLinkedList(10, 1, 9);

		LinkedListNode intersect = intersectNode(node1, node2);
		System.out.println(intersect != null ? intersect.data : "NO intersection");
	}

}
