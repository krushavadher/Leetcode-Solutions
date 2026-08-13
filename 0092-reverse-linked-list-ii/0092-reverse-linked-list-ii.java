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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i=1;
        if(left==right)return head;
        ListNode temp=head;
        ListNode prev=null;
        temp=head;
        while(i<left){
            prev=temp;
            temp=temp.next;
            i++;
        }

        ListNode n=temp;
        while(i<right){
            temp=temp.next;
            i++;
        }
        ListNode nxt=temp.next;
        temp.next=null;

        ListNode rev=rev(n);
        if(prev!=null){
            prev.next=rev;
        }
        
        if(nxt!=null)n.next=nxt;
        if(prev!=null)return head;
        return rev;
    }
}