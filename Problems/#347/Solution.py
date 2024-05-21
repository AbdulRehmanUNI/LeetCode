class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map=Counter(nums)
        sorted_map= sorted(map.keys() , key= lambda x: map[x], reverse= True)
        return sorted_map[:k]