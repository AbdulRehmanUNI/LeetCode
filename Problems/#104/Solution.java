class Solution {
    public int maxDepth(TreeNode root) {
       if(root==null) return 0;
        else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);

            return 1+ Math.max(lDepth,rDepth);
    }
    }
}



//my time complexity was 100%, but for some reason the space complexity was around 50% , i tried a bunch of sols, didn't work that much