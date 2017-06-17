package chapter_2;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Q2_kthElement {
	
	public static int findElementAt(LinkedListNode node,int position){
		
		LinkedListNode current = node;
		LinkedListNode runner = node;
		while(current.next != null){
			if(--position <= 0)
			{
				runner = runner.next;
			}
			current = current.next;		
		}
		
		return runner.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode node = AssortedMethods.randomLinkedList(10,1,5);
		LinkedListNode current = node;
		while(current.next != null){
			System.out.print(current.data + "\t");
			current = current.next;
		}
		
		current = node;
		System.out.println(findElementAt(current,1));
		

	}

}
