# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        n = i = 1
        temp = head
        while head is not None:
            n += 1
            head = head.next
        if n % 2 == 0:
            n -= 1
        while i < n / 2:
            temp = temp.next
            i += 1
        return temp
