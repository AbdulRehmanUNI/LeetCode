class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        i, j, ans=0, len(people)-1, 0
        people.sort()

        while i<=j:
            remain= limit - people[j]
            j-=1
            if people[i]<= remain: i+=1
            ans+=1
        return ans