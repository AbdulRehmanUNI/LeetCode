class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map=defaultdict(list)
        for i in range(len(nums)):
            complement= target-nums[i]
            if complement in map: return [map[complement][0],i]
            map[nums[i]].append(i)
        return [-1,-1]