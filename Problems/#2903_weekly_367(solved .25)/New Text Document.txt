class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] ans=new int[2];
        int one=-1, two=-1;
        
        for(int i=0;i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(Math.abs(i-j)>=indexDifference){
                    if(Math.abs(nums[i]-nums[j])>=valueDifference){
                        one=i;
                        two=j;
                    }
                }
            }
        }
        ans[0]=one;
        ans[1]=two;
        return ans;
        
        
    }
}