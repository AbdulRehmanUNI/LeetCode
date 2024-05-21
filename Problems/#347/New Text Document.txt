
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++) map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        // for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     if(entry.getValue()>=k) ans.add(entry.getKey());
        // }
        for(int i=0; i<k; i++){
          int key=  Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
          ans.add(key);
          map.remove(key);
        }
        int arr[]=new int[ans.size()];
        for(int i=0; i<arr.length; i++) arr[i]=ans.get(i);
        return arr;
    }
}