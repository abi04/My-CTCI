package chapter_2;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Q3_DeleteMiddleNode {
	
	public static LinkedListNode getNode(LinkedListNode node,int position){
		while(--position != 0 && node != null ){
			node = node.next;
		}		
		return node;
	}

	public static void deleteNode(LinkedListNode node){
		node.data = node.next.data;
		node.next = node.next.next;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode node = AssortedMethods.randomLinkedList(10,1,5);
		LinkedListNode current = node;
		while(current != null){
			System.out.print(current.data + "\t");
			current = current.next;
		}
		
		System.out.println("\n"+getNode(node,3).data);
		deleteNode(getNode(node,3));
		current = node;
		while(current != null){
			System.out.print(current.data + "\t");
			current = current.next;
		}
		

	}

}
