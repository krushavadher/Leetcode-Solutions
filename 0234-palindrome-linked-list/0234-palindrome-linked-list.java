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
        if(head==null || head.next==null)return head;

        ListNode ans=rev(head.next);
        head.next.next=head;
        head.next=null;
        return ans;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        } 

        ListNode temp=slow;

        if(fast!=null)temp=slow.next;

        ListNode rev=rev(temp);

        while(rev!=null){
            if(head.val!=rev.val){
                return false;
            }
            rev=rev.next;
            head=head.next;
        }
        return true;

    }
}