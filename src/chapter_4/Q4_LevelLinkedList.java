package chapter_4;

import java.util.ArrayList;
import java.util.LinkedList;

import CtCILibrary.AssortedMethods;
import CtCILibrary.TreeNode;

public class Q4_LevelLinkedList {
	

		 
	
	public static void createLinkedList(TreeNode root,ArrayList<LinkedList<TreeNode>> lists,int level)
	{
	
		if(root == null)
			return;
		LinkedList<TreeNode> list = null;
		if(lists.size() == level)
		{
			list = new LinkedList<TreeNode>();
			
			lists.add(list);
			
		}
		else
			list = lists.get(level);
		
		list.add(root);
		createLinkedList(root.left,lists,level+1);
		createLinkedList(root.right,lists,level+1);
		
		
	}
	
	public static ArrayList<LinkedList<TreeNode>> createLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> list = new ArrayList<LinkedList<TreeNode>>();
		createLinkedList(root,list,0);
		return list;
	}
	
	public static ArrayList<LinkedList<TreeNode>> createLinkedList2(TreeNode root){
		ArrayList<LinkedList<TreeNode>> list = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		
		if(root != null)
		 current.add(root);
		
		while(current.size() > 0){
			list.add(current);
			LinkedList<TreeNode> parent  = current;
			current = new LinkedList<TreeNode>();
			for(TreeNode node :parent){
				if(node.left != null)
					current.add(node);
				if(node.right != null)
					current.add(node);	
			}
			
		}
		return list;
		}
	
	public static void main(String[] args){
		
		TreeNode tnode = AssortedMethods.randomBST(20,1,20);
	
		
		ArrayList<LinkedList<TreeNode>> list = createLinkedList2(tnode);
		for(LinkedList<TreeNode> l : list){
			for(TreeNode t:l){
				System.out.print(t.data+"\t");
			}
			System.out.println("\n");
		}
	}
		
	}


