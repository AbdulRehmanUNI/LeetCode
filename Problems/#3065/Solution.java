class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        for(int i:nums){
            if(i<k) ans++;
            else break;
        }
        return ans;
        
    }
}