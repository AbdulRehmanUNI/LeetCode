class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int []arr=new int[nums.length];
        final int bitSize = nums[0].length(),maxNum = 1 << bitSize;// left shift operator
        for(int i=0;i<nums.length; i++) arr[i]=Integer.parseInt(nums[i], 2);
        Arrays.sort(arr);
        for(int i=0; i<=maxNum; i++){
            if(!binarySearch(arr,i,0,arr.length-1)) 
            return String.format("%" + bitSize + "s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        throw new IllegalArgumentException();
    }

    public boolean binarySearch(int[] array,int x, int low, int high){
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (array[mid] == x) return true;
      if (array[mid] < x) low = mid + 1;
      else high = mid - 1;
    }
    return false;
    }
}