/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle1(ListNode head){
        // if(head.next==null || head==null)
        //     return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return slow;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        
        ListNode cur=head,temp=detectCycle1(head);
        if(temp==null)
            return null;
        while(cur!=temp){
            cur=cur.next;
            temp=temp.next;
        }
        return cur;
    }
}