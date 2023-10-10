class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    long product = (long)(nums[i] - nums[j]) * nums[k];
                    if(product > ans) ans = product;
                }
            }
        }
        return (ans <0) ? 0 : ans;
    }
}