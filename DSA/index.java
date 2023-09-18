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