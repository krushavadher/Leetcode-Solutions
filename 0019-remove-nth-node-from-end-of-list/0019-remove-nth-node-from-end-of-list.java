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
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(c==n){
            if(head.next==null)return null;

            head=head.next;
            return head;
        }
        ListNode t=head;
        for(int i=1;i<c-n;i++){
            t=t.next;
        }
        if(t.next!=null){
            t.next=t.next.next;
        }
        else{
            t.next=null;
        }
        return head;
    }
}