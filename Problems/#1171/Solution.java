/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        while (head != null) {
            list.add(head.val);
            sum += head.val;
            head = head.next;
        }
        if (sum == 0)
            return null;
        removeZeros(list);
        for(int i=0; i<list.size(); i++) if (list.get(i)==0) list.remove(list.get(i));
        ListNode ans = new ListNode(0);
        head = ans;
        for (int i = 0; i < list.size(); i++) {
            ans.next = new ListNode(list.get(i));
            ans = ans.next;
        }
        return head.next;
    }

public static void removeZeros(List<Integer> list){
    boolean found;
    do {
        found = false;
        for(int i = 0; i < list.size(); i++){
            int sum = list.get(i);
            for(int j = i + 1; j < list.size(); j++){
                sum += list.get(j);
                if(sum == 0){
                    while(i <= j){
                        list.remove(i);
                        j--;
                    }
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
    } while(found);
}
}