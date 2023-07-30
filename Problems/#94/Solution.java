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
    public List<Integer> inorderTraversal(TreeNode root) {
         ArrayList<Integer> ans = new ArrayList<Integer>();
          inOrder(root, ans);
            return ans;
    }
    	private void inOrder(TreeNode localRoot,ArrayList<Integer> list){
		if(localRoot != null){
			inOrder(localRoot.left,list);
			list.add(localRoot.val);
			inOrder(localRoot.right,list);
		}
	}
}