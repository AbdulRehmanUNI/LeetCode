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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return Check(nums,0,nums.length-1);     
    }
    public TreeNode Check(int[] nums, int start, int end){
     if(start>end) return null;
        int max=start;
        for(int i=start; i<=end; i++) if(nums[i]>nums[max]) max=i;
        TreeNode n=new TreeNode(nums[max]);
        n.left=Check(nums,start,max-1);
        n.right=Check(nums,max+1,end);
        return n;
    }
}