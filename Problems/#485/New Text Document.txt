class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0;
        int temp=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                temp++;
                if(temp>maxOnes) maxOnes=temp;
            }
            else temp=0;
        }
        return maxOnes;
        
    }
}