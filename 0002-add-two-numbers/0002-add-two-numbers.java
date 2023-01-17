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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> s1 = new ArrayList<>();
        while(l1!=null){
            s1.add(l1.val);
            l1 = l1.next;
        }
        ArrayList<Integer> s2 = new ArrayList<>();
        while(l2!=null){
            s2.add(l2.val);
            l2 = l2.next;
        }
        int carry=0;
        ListNode newHead=null;
        int index=0;
        int len1=s1.size(),len2=s2.size();

        Stack<Integer> s = new Stack<>();

        while(index<len1 || index<len2 || carry!=0){
            int n1 = (index>=len1) ? 0:s1.get(index);
            int n2 = (index>=len2) ? 0:s2.get(index);
            index++;
            int temp=n1+n2+carry;
            s.push(temp%10);
            carry = temp/10;
        }
        
        while(!s.isEmpty()){
            ListNode newNode = new ListNode(s.pop());
            newNode.next = newHead;
            newHead = newNode;
        }
        return newHead;
    }
}