package chapter_4;

import CtCILibrary.TreeNode;
import CtCILibrary.TreeNode;

public class Q7_CommonAncestor {

	public static Boolean cover(TreeNode root, int p) {
		if (root == null)
			return false;
		if (root.data == p)
			return true;
		return cover(root.left, p) || cover(root.right, p);

	}

	public static TreeNode lowestCommonAncestorHelper(TreeNode root, int p, int q) {
		if (root == null)
			return null;
		if (root.data == p || root.data == q)
			return root;

		Boolean checkLeftP = cover(root.left, p);
		Boolean checkLeftQ = cover(root.left, q);

		if (checkLeftP != checkLeftQ)
			return root;

		TreeNode side = checkLeftP ? root.left : root.right;

		return lowestCommonAncestorHelper(side, p, q);

	}

	static TreeNode lca(TreeNode root, int v1, int v2) {

		return lowestCommonAncestorHelper(root, v1, v2);

	}
	
	/////////////////////////////////////////////Method  2///////////////////////////////////
	 public static TreeNode lowestCommonAncestorHelper2(TreeNode root, int p, int q) {
	        if(root == null) return null;
	        if(root.data == p && root.data == q) return root;
	        
	        TreeNode x = lowestCommonAncestorHelper(root.left,p,q);
	        if(x != null && x.data != p && x.data !=q)
	            return x;
	        
	        TreeNode y = lowestCommonAncestorHelper(root.right,p,q);
	        if(y != null && y.data != p && y.data !=q)
	            return y;
	        
	        if(x != null && y != null)
	            return root;
	        else if (root.data == p || root.data == q )
	            return root;
	        else
	            return x != null ? x : y;
	                   
	    }

}
