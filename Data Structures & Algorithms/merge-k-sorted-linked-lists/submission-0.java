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
        PriorityQueue<ListNode> top = new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode head: lists){
            top.offer(head);
        }
        ListNode tempNode = new ListNode(-1);
        ListNode headNode = tempNode;
        while(top.size()!=0){
            tempNode.next = top.poll();
            tempNode = tempNode.next;
            if(tempNode.next != null){
                top.offer(tempNode.next);
            }
        }
        return headNode.next;
    }
}
