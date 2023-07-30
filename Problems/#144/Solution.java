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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
          preOrder(root, ans);
            return ans;
    }
     	private void preOrder(TreeNode localRoot,ArrayList<Integer> list){
		if(localRoot != null){
            list.add(localRoot.val);
			preOrder(localRoot.left,list);
			preOrder(localRoot.right,list);
		}
       }
}