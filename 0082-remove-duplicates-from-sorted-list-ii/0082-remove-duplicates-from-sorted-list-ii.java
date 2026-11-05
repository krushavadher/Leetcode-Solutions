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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;

       if(head!=null && head.next!=null && head.next.val==head.val){
         while(head!=null && head.next!=null && head.val==head.next.val){
            head=head.next;
        }
        head=head.next;
       }
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            if(curr.next!=null && curr.val==curr.next.val){
                
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                }
                   if(prev==null ){
                        head=curr.next;
                    }

                 else{
                    prev.next=curr.next;
                 }
                
                curr=curr.next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
            
           
        }
        return head;
    }
}