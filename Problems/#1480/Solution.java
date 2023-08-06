class Solution {
    public int[] runningSum(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=check(nums,i);
        }
        return arr;
    }
    private int check(int[] nums,int i){
        int test=0;
        for(int j=0;j<=i;j++){
            test+=nums[j];
        }
        return test;
    }
}