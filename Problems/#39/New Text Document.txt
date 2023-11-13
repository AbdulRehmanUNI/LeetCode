class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombinations(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }
    private void findCombinations(int[] candidates, int index, int target,List<Integer> current,List<List<Integer>> ans){
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) return;

        for (int i = index; i < candidates.length; i++) {
            current.add(candidates[i]);
            findCombinations(candidates, i, target - candidates[i], current, ans);
            current.remove(current.size() - 1);
        }
    }
}