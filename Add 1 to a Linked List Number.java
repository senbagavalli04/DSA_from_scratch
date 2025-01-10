
// CODE LINK :https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=add-1-to-a-number-represented-as-linked-list


class Solution {
    public Node addOne(Node head) {
       // Node curr = head;
        Node curr = reverse(head);
        int s=0;
        int carry =1;
        Node temp = curr;
        while(temp != null && carry>0){
            s = temp.data + carry;
            temp.data = s%10;
            carry = s/10;
            if(temp.next == null && carry>0){
                temp.next = new Node(carry);
                break;
            }
            temp = temp.next;
        }
        head = reverse(curr);
        return head;
    }
    public Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        Node nextNode;
        while(cur != null){
            nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    }
