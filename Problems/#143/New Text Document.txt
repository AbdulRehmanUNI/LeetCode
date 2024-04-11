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
    public void reorderList(ListNode head) {
        if(head.next==null) return ;
        List<ListNode> ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ans.add(temp);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(0);
        int i=0,j=ans.size()-1;
        head=ans.get(i);
        dummy.next=head;
        head.next=ans.get(j);
        head=head.next;
        i++;
        j--;

        while(i<=j){
            head.next=ans.get(i++);
            head=head.next;
            head.next=ans.get(j--);
            head=head.next;
        }
        head.next=null;

        head=dummy.next;
    }
}