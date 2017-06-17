package chapter_4;

import CtCILibrary.TreeNode;

public class Q5_CheckBST {

	 public Integer lastValue = null;
	    
	    public boolean isValidBST(TreeNode root) {
	        
	        if(root == null)
	            return true;
	        
	        if(!isValidBST(root.left))
	            return false;
	        
	        if(lastValue != null && root.data <= lastValue)
	            return false;
	        lastValue = root.data;
	        
	        if(!isValidBST(root.right))
	            return false;
	            
	        
	        return true;
	    
	        
	    }
	    public boolean isValidBST(TreeNode root,Integer min,Integer max)
	    {
	        if(root == null)
	            return true;
	        
	        if((min != null && root.data <= min) || (max != null && root.data >= max))
	            return false;
	        
	        if(!isValidBST(root.left,min,root.data) || !isValidBST(root.right,root.data,max))
	            return false;
	            
	        return true;
	    }
	    
	    public boolean isValidBST1(TreeNode root) {
	        
	        return isValidBST(root,null,null);
	      
	        
	    }
}
