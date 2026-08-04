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

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(k==0)return head;
        k=k%c;
        ListNode t1=head;
        ListNode newnode=new ListNode(0);
        ListNode t=newnode;

        for(int i=0;i<c-k;i++){
            t1=t1.next;
        }

        while(t1!=null){
            t.next=t1;
            t1=t1.next;
            t=t.next;
        }
        

        for(int i=0;i<c-k;i++){
            t.next=head;
            head=head.next;
            t=t.next;
        }
        t.next=null;

        return newnode.next;



    }
}