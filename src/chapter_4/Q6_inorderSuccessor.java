package chapter_4;

import CtCILibrary.AssortedMethods;
import CtCILibrary.TreeNode;

public class Q6_inorderSuccessor {
	
	public static TreeNode successorNode(TreeNode root){
		
		if(root == null)
			return null;
		if(root.right != null)
			return leftmostNode(root.right);
		else
		{
			TreeNode q = root;
			TreeNode parent  = root.parent;
			
			while(parent != null && parent.left != q){
				q = parent;
				parent = parent.parent;
			}
			return parent;
		}
	}
	
	public static TreeNode leftmostNode(TreeNode root){
		if(root == null)
			return null;
		while(root.left != null)
		{
			root = root.left;		
		}	
		
		return root;
	}
	
	
	public static void main(String[] args){
		
	TreeNode root =	AssortedMethods.randomBST(10,1,10);
	System.out.println(successorNode(root).data);
	}

}
