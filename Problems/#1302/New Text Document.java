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
 //for refrence https://velog.io/@victor/leetcode-6rbn9y17, bruh its not my code hehe 
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        inOrder(root, 0);
        inOrder1(root, 0);
        return sum;
    }
    int sum = 0;
    public void inOrder1(TreeNode node, int depth) {
        if (node == null) return;
        inOrder1(node.left, depth + 1);
        inOrder1(node.right, depth + 1); 
        if (depth == max)  this.sum += node.val;     
    }
    int max = 0;
    public void inOrder(TreeNode node, int depth) {
        if (node == null) return;
        inOrder(node.left, depth + 1);
        inOrder(node.right, depth + 1);                
        this.max = Math.max(depth, this.max);
    }
}