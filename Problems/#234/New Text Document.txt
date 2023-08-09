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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        if(head.next==null) return true;
        ListNode temp=head;
        Stack<Integer> s=new Stack<Integer>();

        while(head!=null){
            s.push(head.val);
            head=head.next;
        } 
        while(temp!=null){
            if(temp.val!=s.pop()) return false;
            temp=temp.next;
        }
        return true;
    }
}