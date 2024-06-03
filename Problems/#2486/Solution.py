class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        ans=len(t)
        j=0
        for i in range(0, len(s)):
            if j==len(t): return ans
            else: 
                if s[i]==t[j]:
                    j+=1
                    ans-=1
        return ans
