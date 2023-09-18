https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode Head = head, prev = head, temp=head, node = head;
        int num = 1, len=1;

        while(temp != null){
            len++;
            temp = temp.next;
        }
        num = len - n;
        int counter = 1;

        if(num == 1){
            head = node.next;
            return head;
        }

        while(node != null && num != counter){
            counter++;
            prev = node;
            node = node.next;
        }

        prev.next = node.next;
        return Head;
    }
}

https://leetcode.com/problems/delete-node-in-a-linked-list/description/
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

//https://leetcode.com/problems/intersection-of-two-linked-lists/description/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)return null;
        ListNode c1=headA;
        ListNode c2=headB;
        while(c1!=c2){
            if(c1==null) c1=headB;
            else c1=c1.next;
            if(c2==null) c2=headA;
            else c2=c2.next;
        }
       return c1;
    }
}