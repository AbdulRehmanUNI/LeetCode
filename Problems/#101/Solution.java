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
  public boolean isSymmetric(TreeNode root) {
    if(root.left==null && root.right==null) return true;
    if(root==null || root.right==null || root.left==null) return false;
    return isSymmetric(root.left, root.right);
  }
  private boolean isSymmetric(TreeNode p, TreeNode q) {
      if(p==null || q==null) return p==q;
      return p.val==q.val && isSymmetric(p.left,q.right) && isSymmetric(p.right,q.left);
  }
}
