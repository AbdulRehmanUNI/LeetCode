class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans=new int[nums.length],even=new int[nums.length/2],
        odd=new int[nums.length/2];

        int j=0, k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0) {even[j]=nums[i]; j++;} 
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0) {odd[k]=nums[i]; k++;} 
        }
        
        j=0; k=0;
        for(int i=0; i<ans.length; i++){
            if(i%2==0){ ans[i]=even[j]; j++;}
            else {ans[i]=odd[k]; k++;}
        }
        return ans;
    }
}