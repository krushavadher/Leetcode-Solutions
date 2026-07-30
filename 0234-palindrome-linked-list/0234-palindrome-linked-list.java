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
    public boolean isPalindrome(ListNode head) {
       
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;  
        }
        ListNode t=rev(slow.next);
        ListNode temp=head;
    
        while(t!=null ){
            if(temp.val!=t.val){
                return false;
            }
            temp=temp.next;
            t=t.next;
        }
        return true;    
    }
}