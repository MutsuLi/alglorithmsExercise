package exercise;

public class LinklistProblems {

    //19. 删除链表的倒数第N个节点
    // 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

    //两次遍历
    public static ListNode removeNthFromEnd_2n(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode first = head;
        while (first.next != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }

    //一次遍历
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy; //头结点用来简化某些极端情况，例如列表中只含有一个结点，或需要删除列表的头部.
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 0; i < n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
