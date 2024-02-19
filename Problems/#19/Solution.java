class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        } 
        n = size - n;
        if(n == 0) return head.next;
        temp = head;
        int var = 0;
        while(temp != null){
            var++;
            if(var == n) break;
            temp = temp.next;
        }
        if (temp != null && temp.next != null) temp.next = temp.next.next;
        return head;
    }
}