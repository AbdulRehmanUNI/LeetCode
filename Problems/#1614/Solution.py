class Solution:
    def maxDepth(self, s: str) -> int:
        ans = left = 0
        for c in s:
            if c == '(':
                left += 1
                ans = max(ans, left)
            elif c == ')':
                left -= 1

        return ans