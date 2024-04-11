/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start=list2, end=null,head=list1;
        while(list2!=null){
            end=list2;
            list2=list2.next;
        }
        int i=0;
        while(i<a-1){
            list1=list1.next;
            i++;
        }
        ListNode temp=list1;
        while(i<=b){
            list1=list1.next;
            i++;
        }
        temp.next=start;
        end.next=list1;
        return head;
    }
}