class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> countMap=new HashMap<>();

        for(int num: nums) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        for(int num: nums){
            if(!countMap.containsKey(num+1) && !countMap.containsKey(num-1) && countMap.get(num)==1) 
                ans.add(num);
        }
        return ans;
    }
}