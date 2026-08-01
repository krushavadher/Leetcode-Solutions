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
        int len1=0;
        ListNode t1=headA;
        while(t1!=null){
            len1++;
            t1=t1.next;
        }
        int len2=0;
        ListNode t2=headB;
        while(t2!=null){
            len2++;
            t2=t2.next;
        }

        if(len2>len1){
            ListNode temp=headA;
            headA=headB;
            headB=temp;
        }

        int diff=Math.abs(len1-len2);
        while(diff>0){
            headA=headA.next;
            diff--;
        }
        while(headA!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;


    }
}