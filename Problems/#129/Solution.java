// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int sumNumbers(TreeNode root) {
//         AtomicInteger ans = new AtomicInteger(0);
//         pre(root,"",ans);
//         return (int)ans;
//     }
//     public static void pre(TreeNode root,String path,AtomicInteger ans){
//         if(root==null) return;

//         path+=Integer.toString(root.val);
//         if(root.left==null && root.right==null) ans+=Integer.parseInt(path);
//         pre(root.left,path,ans);
//         pre(root.right,path,ans); 
//     }
// }

//better

class Solution {
    public int sumNumbers(TreeNode root) {
        return recur(root, 0);
    }
    public int recur(TreeNode root, int n) {
        if (root == null) {
            return 0;
        }
        n *= 10;
        n += root.val;
        if (root.left == null && root.right == null) {
            return n;
        }
        return (recur(root.left, n) + recur(root.right, n));
    }
}