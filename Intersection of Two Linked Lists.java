//CODE LINK : https://leetcode.com/problems/intersection-of-two-linked-lists/description/
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
        if(headA == null ||  headB == null ){
            return null;
        }
        int c1 = count(headA);
        int c2 = count(headB);
        if (c1> c2){
            while(c1 > c2){
                headA = headA.next;
                c1--;
            }
        }
        else{
            while(c1 < c2){
            headB = headB.next;
            c2--; 
            }
        }
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1 == temp2){
            return temp1;
        }
        return null;
    }
    public int count(ListNode head){
        if(head == null) return 0;
        int c=0;
        ListNode curr = head;
        while(curr != null){
            c++;
            curr = curr.next;
        }
        return c;
    }
}
