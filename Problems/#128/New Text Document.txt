class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums)==0: return 0  
        nums.sort()
        ans, temp=1,1
        for i in range(1, len(nums)):
            if nums[i-1]==nums[i]: continue
            if nums[i-1]+1==nums[i]: temp+=1
            else:
                ans=max(ans,temp)
                temp=1
        return max(ans,temp)