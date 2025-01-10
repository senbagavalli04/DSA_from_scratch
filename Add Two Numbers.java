//CODE LINK : https://leetcode.com/problems/add-two-numbers/description/
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
    public ListNode addTwoNumbers(ListNode t1, ListNode t2) {
        ListNode rev1 = t1;
        ListNode rev2 = t2;
        ListNode ansHead = null;
        ListNode curHead = null;
        int carry =0;
        while(rev1 != null || rev2 != null || carry !=0){
            int s = carry;
            if(rev1!= null){
                s+=rev1.val;
                rev1 = rev1.next;
            }
            if(rev2!= null){
                s+=rev2.val;
                rev2 = rev2.next;
            }
            carry = s/10;
            ListNode nn = new ListNode(s%10);
            if(ansHead == null){
                ansHead = nn;
                curHead = ansHead;
            }
            else{
                curHead.next = nn;
                curHead = curHead.next;
            }

        }
        return ansHead;
    }
      
}
