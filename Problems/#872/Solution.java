class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        inOrder(root1,l1);
        inOrder(root2,l2);
        return l1.equals(l2);
    }
    public void inOrder(TreeNode root, List<Integer> list){
        if(root==null) return;
        if(root.left==null && root.right==null){
             list.add(root.val);
             return;
        }
        inOrder(root.left,list);
        inOrder(root.right,list);
    }

}