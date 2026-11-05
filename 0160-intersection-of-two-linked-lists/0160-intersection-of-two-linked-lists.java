/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=0,c2=0;
        ListNode t1=headA;
        ListNode t2=headB;


        while(t1!=null){
            c1++;
            t1=t1.next;
            
        }
        while(t2!=null){
            c2++;
            t2=t2.next;
        }

        if(c1>c2){
            for(int i=1;i<=c1-c2;i++){
                headA=headA.next;
            }
        }else{
            for(int i=1;i<=c2-c1;i++){
                headB=headB.next;
            }
        }

        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}