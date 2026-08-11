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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        
        ListNode t=head;
        int c=0;
        while(t!=null){
            c++;
            t=t.next;
        }
        ListNode ans=null;
        ListNode prev=null;


        while(temp!=null){
            if(c<k){
                if(prev!=null){
                    prev.next=temp;
                }
                break;
            }
            else{
                ListNode newnode=temp;
                ListNode it=null;
               
                for(int i=1;i<=k;i++){
                    it=temp;
                    temp=temp.next;
                    c--;
                }
               
                it.next=null;
                ListNode r=rev(newnode);

                if(ans==null){
                    ans=r;
                }
                if(prev!=null){
                    prev.next=r;
                }
                prev=newnode;
            }

            
        }
        return ans;
    
    }
}