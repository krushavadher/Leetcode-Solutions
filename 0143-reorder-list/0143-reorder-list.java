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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode t=rev(slow);

        ListNode first=head;
        ListNode sec=t;
        while(sec.next!=null){
            ListNode temp1=first.next;;
            ListNode temp2=sec.next;

            first.next=sec;
            sec.next=temp1;

            first=temp1;
            sec=temp2;
        }


    }
}