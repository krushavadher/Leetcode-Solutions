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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
       
        if(c==n){
            return head.next;
        }
        ListNode t=head;
        int i=0;
         c=c-n;
        while(i<c-1){
            t=t.next;
            i++;
        }
        
        t.next=t.next.next;
        return head;
    }
}