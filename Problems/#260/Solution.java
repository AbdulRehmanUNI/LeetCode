class Solution {
    public int[] singleNumber(int[] nums) {
        int x_or= 0;
        for(int n: nums) x_or^=n;

        int a=0, b=0;

        int dif_bit=1; // 0000000000000.....0001

        while(((x_or>>dif_bit)&1) !=1 ) dif_bit++;

        for(int n: nums){
            if(((n>>dif_bit)&1) ==1) a^=n;
            else b^=n;
        }
        return new int[]{a,b};
    }
} // best solution


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