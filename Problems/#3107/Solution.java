class Solution {
		public long minOperationsToMakeMedianK(int[] nums, int k) {
			Arrays.sort(nums);
			int mid = nums[nums.length/2];
			long ans = 0;
			if(k < mid){
				for(int i = 0;i <= nums.length/2;i++){
					if(nums[i] > k){
						ans += nums[i]-k;
					}
				}
			}else {
				for(int i = nums.length/2;i < nums.length;i++){
					if(nums[i] < k){
						ans += k-nums[i];
					}
				}
			}
			return ans;
		}
	}
