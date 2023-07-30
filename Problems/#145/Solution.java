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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        postOrder(root, ans);
        return ans;
    }
     	private void postOrder(TreeNode localRoot,ArrayList<Integer> list){
		if(localRoot != null){
            
			postOrder(localRoot.left,list);
			postOrder(localRoot.right,list);
            list.add(localRoot.val);
		}
       }
    }
