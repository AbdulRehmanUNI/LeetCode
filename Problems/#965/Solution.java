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
    boolean test=true;
    public boolean isUnivalTree(TreeNode root) {
        int val=root.val;
        return check(root,val);
    }
    private boolean check(TreeNode root, int val){
     if(root==null) return test;
     if(test==false) return test;
     if(root.left!=null){
         if(root.left.val!=val) return test=false;
        check(root.left,val);
     }

      if(root.right!=null){
         if(root.right.val!=val) return test=false;
        check(root.right,val);
     }
        return test;
    }
}