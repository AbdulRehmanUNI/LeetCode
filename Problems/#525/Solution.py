class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = defaultdict(int)
        max_len = 0
        curr_sum = 0
        hashmap[0] = -1
        for i, num in enumerate(nums):
            curr_sum += 1 if num == 1 else -1
            if curr_sum in hashmap: max_len = max(max_len, i - hashmap[curr_sum])
            else: hashmap[curr_sum] = i
        return max_len
