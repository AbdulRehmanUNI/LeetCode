class Solution(object):
    def minimumLength(self, s):
        left, suffix = 0, len(s) - 1
        
        while left < suffix and s[left] == s[suffix]:
            char = s[left]
            while left <= suffix and s[left] == char:
                left += 1
            while suffix >= left and s[suffix] == char:
                suffix -= 1
        
        return suffix - left + 1