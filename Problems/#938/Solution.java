//my sol , its good in space but almost 50% in time

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        inOrder(root,low ,high);
        return sum;
        
    }
    private void inOrder(TreeNode localRoot,int l,int h){
		if(localRoot != null){
            if(localRoot.val>=l && localRoot.val<=h) sum+=localRoot.val;
			inOrder(localRoot.left,l,h);
			inOrder(localRoot.right,l,h);
		}
	}
}

*-------------------------------------------------------------------------------------------------------------------------------------------------------*

// optimised the sub-optimal code , from fire ship video how to flex as a programmer


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {

        if(root==null) return 0;
        int sum=0;
        if(root.val>=low && root.val<=high) sum+=root.val;
        if(root.val>low) sum+=rangeSumBST(root.left, low, high);
        if(root.val<high) sum+=rangeSumBST(root.right, low, high);
         return sum;
  
	}
}


