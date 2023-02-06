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
    public int getDecimalValue(ListNode head) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int ans=0;
        while(size-- >0){
            ans += Math.pow(2,size)*head.val;
            head = head.next;
        }
        return ans;
    }
}