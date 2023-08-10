class Solution {
   public int[] twoSum(int[] nums, int target) {
       int[] arr=new int[2];
       for(int i=0; i<nums.length; i++){
           for(int j=i+1; j<nums.length; j++){
               if(nums[i]+nums[j]==target){
                   arr[0]=i;
                   arr[1]=j;
                   return arr;y
               }//if
           }//for
       }//for
       return null;
     }//f()
}


    //a little more optimised 
// class Solution {
//    public int[] twoSum(int[] nums, int target) {
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i]+nums[j]==target && i!=j){
//                     int [] arr={i,j};
//                     return arr;
//                 }
//             }
//         }
//         return null;
//      }
// }




//--------------------- form leetcode sols

/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
    
}*/