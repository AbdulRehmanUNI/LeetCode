class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0, nums, nums.length, ans ,new ArrayList<>());
        return ans;
    }
    public void solve(int i, int[] nums, int n, List<List<Integer>> ans, List<Integer> temp){
        if(i==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        solve(i+1, nums, n, ans, temp); // include
        temp.removeLast();
        solve(i+1, nums, n, ans, temp); // edclude
    }
}