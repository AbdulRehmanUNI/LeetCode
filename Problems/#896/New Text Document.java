class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean test=true;
        for(int i=0; i<nums.length; i++){
            if(i+1<nums.length){
                if(!(nums[i]<=nums[i+1])) { test=false; break; }
            }
        }
        if(test) return test;

            test=true;
            for(int i=0; i<nums.length; i++){
                if(i+1<nums.length){
                    if(!(nums[i]>=nums[i+1])) { test=false; break; }
                }
            }
        return test;
    }
}

// by dylan smith sir

// class Solution {
//     public boolean isMonotonic(int[] nums) {
//         boolean valid = true;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i - 1] > nums[i]) {
//                 valid = false;
//             }
//         }
//         if (valid) {
//             return true;
//         }
//         valid = true;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i - 1] < nums[i]) {
//                 valid = false;
//             }
//         }
//         return valid;
//     }
// }