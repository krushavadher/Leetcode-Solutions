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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for(int i=0;i<lists.length;i++){
            ListNode t=lists[i];
            while(t!=null){
                pq.add(t);
                t=t.next;
            }

        }

        ListNode node=new ListNode(0);
        ListNode temp=node;
        while(!pq.isEmpty()){

            temp.next=pq.poll();
            temp=temp.next;
        }
        temp.next=null;
        return node.next;
    }
}