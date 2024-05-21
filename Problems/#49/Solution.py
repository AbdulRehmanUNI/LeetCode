class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = defaultdict(list)
        for word in strs:
            sorted_word = "".join(sorted(word))
            map[sorted_word].append(word)
        ans = list(map.values())
        return ans