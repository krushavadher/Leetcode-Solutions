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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null)return head;

        
        ListNode temp=head;
       for(int i=0;i<k;i++){
        if(temp==null)return head;
        temp=temp.next;
       }
        ListNode curr=head;
        ListNode prev=null;

        ListNode grp=head;

         for(int i=0;i<k;i++){
            ListNode t=curr.next;
            curr.next=prev;
            prev=curr;
            curr=t;
        }

        grp.next=reverseKGroup(curr,k);
        return prev;



        
    }
   
}