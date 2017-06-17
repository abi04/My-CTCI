package chapter_4;

public class Q3_CreateBST {
	
	
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 

	    
	    public TreeNode createBST(int[] nums,int start,int end){
	        if(end < start)
	            return null;
	    
	    
	        int mid = (start + end) / 2 ;
	        TreeNode root = new TreeNode(nums[mid]);
	        root.left = createBST(nums,start,mid-1);
	        root.right = createBST(nums,mid+1,end);
	        
	        return root;
	     
	    }
	    
	    public TreeNode sortedArrayToBST(int[] nums) {
	        
	        return createBST(nums,0,nums.length-1);
	        
	    }
	}

