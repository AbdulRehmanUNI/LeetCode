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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode temp=head;
        while(temp.next!=null){
            ListNode one=temp,two=temp.next;
            ListNode gcd=new ListNode(getGCD(one.val,two.val));
            one.next=gcd;
            gcd.next=two;
            temp=gcd.next;
        }
        return head;
    }
    public int getGCD(int a, int b){
        if(b==0) return a;
        return getGCD(b,a%b); 
    }
}