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

    ListNode rev(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode ans=rev(head.next);
        head.next.next=head;
        head.next=null;
        return ans;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        
        for(int i=0;i<k;i++){
            if(temp==null){
                return head;
            }
            temp=temp.next;
        }
        ListNode next=temp;
        ListNode last=head;
        for(int i=1;i<k;i++){
            last=last.next;
        }
        last.next=null;

        ListNode r=rev(head);
        head.next=reverseKGroup(next,k);

        return r;
        
    
    
    }
}