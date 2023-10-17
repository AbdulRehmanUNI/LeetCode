class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if (hm.containsKey(nums[i])) hm.put(nums[i], hm.get(nums[i]) + 1); 
            else  hm.put(nums[i], 1); 
        }
        int one =Integer.MIN_VALUE,two=0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                if(one==Integer.MIN_VALUE) one=entry.getKey();
                else two=entry.getKey();
            }
        }
        
        return new int[] {one, two};

        
    }
}