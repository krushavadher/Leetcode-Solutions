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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return null;

        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;

        ListNode odd=head;
        ListNode even=head.next;

        while(odd!=null){
            ListNode temp=odd.next;

            dummy.next=odd;
            dummy=dummy.next;

            if(temp==null)break;
            odd=temp.next;
            if(odd!=null) {
                temp.next=odd.next;
            }
            
        }

        while(even!=null ){
             
            ListNode temp=even.next;

            dummy.next=even;
            dummy=dummy.next;
            even.next=null;
            even=temp;
        }

        dummy.next=null;
        return ans.next;

    }
}