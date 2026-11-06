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
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;

        while(head!=null){
            if(head.next!=null){
                ListNode temp=head.next;
                head.next=head.next.next;
                temp.next=head;
                prev.next=temp;
                prev=head;
                head=head.next;
            }
            else{
                head=head.next;
            }
        }
        return dummy.next;


    }
}