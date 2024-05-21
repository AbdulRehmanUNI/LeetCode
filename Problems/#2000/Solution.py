class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        for i in range(len(word)):
            if ch == word[i]:
                rev = ""
                for j in range(i, -1, -1): 
                    rev += word[j]
                rev += word[i+1:]  
                return rev 
        return word 