class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> copy = new ArrayList<>();
        for (int num : nums) copy.add(num);

        while (!copy.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            Iterator<Integer> iterator = copy.iterator();
            while (iterator.hasNext()) {
                int num = iterator.next();
                if (!temp.contains(num)) {
                    temp.add(num);
                    iterator.remove();
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}