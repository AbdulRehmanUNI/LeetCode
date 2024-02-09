class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if (hm.containsKey(nums[i])) hm.put(nums[i], hm.get(nums[i]) + 1); 
            else  hm.put(nums[i], 1); 
        }
        
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        
        return -1; // Return -1 if no key with value 1 is found
    }
}

// ---------------- revision-------------

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freqMap=new HashMap<>();
        for(int i: nums) freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet())
            if(entry.getValue()==1) return entry.getKey();
        return-1;    

        
    }
}