//https://leetcode.com/problems/linked-list-cycle-ii/submissions/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode n1=head, n2=head;
        while(n1!=null && n2!=null){
            n1 = n1.next;
            n2 = n2.next;
            if(n2!=null){
                n2=n2.next;
            }
            if(n1==n2){
                n1=head;
                while(n1!=n2){
                    n1 = n1.next;
                    n2=n2.next;
                }
                return n1;
            }
        }
        return null;
    }
}