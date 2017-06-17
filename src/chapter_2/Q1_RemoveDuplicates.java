package chapter_2;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Q1_RemoveDuplicates {

	public static LinkedListNode removeDuplicate(LinkedListNode head){
		LinkedListNode current = head;
		while(current != null){
			LinkedListNode runner = current;
			while(runner.next != null){		
				if(runner.next.data == current.data)
				  runner.next = runner.next.next;	
				else
					runner = runner.next;				
			}
			current = current.next;			
		}
		
		
		return head;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	LinkedListNode node = AssortedMethods.randomLinkedList(10,1,5);
	LinkedListNode current = node;
	
	while(current.next != null){
		System.out.print(current.data + "\t");
		current = current.next;
	}
	
	 node = removeDuplicate(node);
	System.out.println("\n");
	
	while(node.next != null){
		System.out.print(node.data + "\t");
		node = node.next;
	}
	
	}

}


