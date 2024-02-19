/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        pre(root, 0, al);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            List<Integer> temp = al.get(i);
            Collections.sort(temp);
            ans.add(temp.get(temp.size() - 1));
        }
        return ans;

    }

    public static void pre(TreeNode root, int l, List<List<Integer>> al) {
        if (root == null)
            return;
        if (al.size() == l) {
            List<Integer> li = new ArrayList<>();
            li.add(root.val);
            al.add(li);
        } else
            al.get(l).add(root.val);
        pre(root.left, l + 1, al);
        pre(root.right, l + 1, al);
    }
}