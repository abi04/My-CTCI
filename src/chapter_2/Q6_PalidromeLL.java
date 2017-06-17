package chapter_2;

import java.util.Stack;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Q6_PalidromeLL {

	public static Boolean isPlalidrome(LinkedListNode node) {
		if (node == null)
			return true;
		LinkedListNode reverse = reverseAndClone(node);
		while (node.next != null && reverse != null) {
			if (node.data != reverse.data)
				return false;
			else {
				node = node.next;
				reverse = reverse.next;
			}
		}

		return true;
	}

	public static LinkedListNode reverseAndClone(LinkedListNode node) {
		LinkedListNode head = null;

		while (node != null) {
			LinkedListNode n = new LinkedListNode();
			n.data = node.data;
			n.next = head;
			head = n;
			node = node.next;
		}

		return head;
	}
	
	public static Boolean isPalidrome1(LinkedListNode node){
		LinkedListNode slow = node;
		LinkedListNode fast = node;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while(fast != null && fast.next != null){
		stack.push(slow.data);
		slow = slow.next;
		fast = fast.next.next;			
		}		
		if(fast != null){
			slow = slow.next;
		}
		
		while(slow != null){
			if(slow.data != stack.pop())
				return false;
			slow = slow.next;			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,1,0,1};
		LinkedListNode node = AssortedMethods.createLinkedListFromArray(arr);
		AssortedMethods.displayNode(node);
		System.out.println(isPalidrome1(node));
	}

}
