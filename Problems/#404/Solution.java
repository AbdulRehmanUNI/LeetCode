class Solution {
    int ans = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        preOrder(root, false);
        return ans;
    }

    private void preOrder(TreeNode localRoot, boolean isLeft) {
        if (localRoot != null) {
            if (localRoot.left == null && localRoot.right == null && isLeft) {
                ans += localRoot.val; // If it's a leaf and a left child, add its value to ans
            }
            preOrder(localRoot.left, true); // Pass true for left child
            preOrder(localRoot.right, false); // Pass false for right child
        }
    }
}
