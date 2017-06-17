package chapter_4;

import CtCILibrary.TreeNode;

public class Q8_SubtreeCheck {
	
	public Boolean containsTree(TreeNode one,TreeNode two){
		
		if(two  == null) return true;
		
		return subTree(one,two);
	}
	
	public Boolean subTree(TreeNode one,TreeNode two){
		
		if(one == null)
			return false;
		if(one.data == two.data)
		{
			if(matchTree(one,two))
				return true;
		}
				
		return subTree(one.left,two) || subTree(one.right,two);
	}
	
	public Boolean matchTree(TreeNode one,TreeNode two){
		if(one == null && two == null)
			return true;
		if(one == null || two == null)
			return false;
		if(one.data != two.data)
			return false;
		return (matchTree(one.left,two.left) && (matchTree(one.right,two.right)));
		
	}
	

}
