public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode nodePointer= head;
        while(nodePointer.next!=null)
        {
            if(nodePointer.next.val==val)
            {
                if(nodePointer.next.next!=null){
                    nodePointer.next.val=nodePointer.next.next.val;
                    nodePointer.next=nodePointer.next.next;
                }else
                {
                    nodePointer.next=null;
                }
            }
            nodePointer=nodePointer.next;
        }
        return nodePointer;
    }
}