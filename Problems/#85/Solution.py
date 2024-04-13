class Solution:
    def maximalRectangle(self, matrix: List[List[str]]) -> int:
        if not matrix: return 0

        m, n=len(matrix), len(matrix[0])
        heights=[0]* (n+1)
        ans=0

        for row in matrix:
            for i in range(n):
                heights[i] = heights[i] + 1 if row[i] == '1' else 0
            stack=[]
            for i in range(len(heights)):
                while stack and heights[i]<heights[stack[-1]]:
                    h=heights[stack.pop()]
                    w=i if not stack else i-stack[-1]-1
                    ans=max(ans, h*w)
                stack.append(i)
        return ans
        