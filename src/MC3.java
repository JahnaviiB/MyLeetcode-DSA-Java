class ListNode {

    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
        this.next = null;
    }
}
public class MC3 {
    public static ListNode removeNthFromEnd(ListNode head, int n){

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;


        for(int i=0;i<=n;i++){
            fast = fast.next;
        }

        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result = removeNthFromEnd(head,2);

        while(result!=null){
            System.out.println(result.val);
            result = result.next;

        }
    }
}
