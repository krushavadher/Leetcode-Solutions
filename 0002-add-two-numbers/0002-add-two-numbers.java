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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1=0;
        ListNode t1=l1;
        while(t1!=null){
            len1++;
            t1=t1.next;

        }
        ListNode t2=l2;
        int len2=0;
        while(t2!=null){
            len2++;
            t2=t2.next;
        }
        if(len2>len1){
           ListNode temp=l1;
           l1=l2;
           l2=temp;
        }
        int c=0;
        ListNode ans=l1;
        ListNode prev=null;
        while(l1!=null){
            int sum=c;
            sum+=l1.val;
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            l1.val=sum%10;
            c=sum/10;

            prev=l1;

            l1=l1.next;
        }
        if(c!=0){
            prev.next=new ListNode(c);
        }
      
        return ans;
    }
}