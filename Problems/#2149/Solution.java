class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2],neg=new int[nums.length/2];

        int j=0,k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                neg[j]=nums[i]; j++;
            }
            else{
                pos[k]=nums[i]; k++;
            }
        }
        j=0; k=0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i]=pos[j]; j++;
            }
            else{ 
            nums[i]=neg[k]; k++;
            }
        }
        return nums;
    }
}

//------------- revision------------------

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];

        for(int i=0,j=0,k=0; i<nums.length; i++){
            if(nums[i]<0) neg[j++]=nums[i];
            else pos[k++]=nums[i]; 
        }
        for(int i=0,j=0,k=0; i<nums.length; i+=2){
            nums[i]=pos[k++];
            nums[i+1]=neg[j++];
        }
    return nums;
    }
}