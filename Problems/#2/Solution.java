
// revision of this question on 26/01/2024

// class Solution {
//   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//       ListNode dummy=new ListNode(0);
//       ListNode temp=dummy;
//       int carry=0;
//       while(l1!=null || l2!=null || carry>0 ){
//           int sum=0;
//           if(l1!=null){
//               sum+=l1.val;
//               l1=l1.next;
//           }
//           if(l2!=null){
//               sum+=l2.val;
//               l2=l2.next;
//           }
//           sum+=carry;
//           carry=sum/10;
//           sum=sum%10;
//           temp.next=new ListNode(sum);
//           temp=temp.next;
//       }
//       return dummy.next;
      
//   }
// }
//-----------------------------------------------------------------------

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         int carry=0;
//         ListNode ans=new ListNode(); 
//         ListNode head=null;

//         while(l1!=null || l2!=null || carry>0){
//             ListNode temp=new ListNode(); 
//             if(l1==null) l1.val=0;
//             if(l2==null) l2.val=0;
//             int num=l1.val+l2.val+carry;
//             carry=0;
//             if(num>=10){
//                 num=num%10;
//                 carry=num/10;
//                 temp.val=num;
//             }
//             else {
//                 temp.val=num;
//             }
//             if(ans==null) {
//                 ans=temp;
//                 head=ans;
//             }
//             else{
//                 ans.next=temp;
//                 ans=ans.next;
//             }
//         }
//         System.gc();
//       return head;
//     }
// }

class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    int carry = 0;

    while (l1 != null || l2 != null || carry > 0) {
      if (l1 != null) {
        carry += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        carry += l2.val;
        l2 = l2.next;
      }
      curr.next = new ListNode(carry % 10);
      carry /= 10;
      curr = curr.next;
    }

    return dummy.next;
  }
}
