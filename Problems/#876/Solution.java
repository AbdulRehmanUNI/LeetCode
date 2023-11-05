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
    public ListNode middleNode(ListNode head) {

        int n=1;
        ListNode temp=head;

        while(head!=null){
            n++;
            head=head.next;
        }
        int i=1;
        if(n%2==0) n-=1;
        while(i<=n/2){
            temp=temp.next;
            i++;
        }
        return temp;
    }
}