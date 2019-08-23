package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    //    public int length=0;
    public ListNode(int x) {
        this.val = x;
    //        length++;
    }
    public static ListNode arrayToListNode(int[] arr) {
        ListNode []nodes = new ListNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MAX_VALUE) {
                nodes[i] = new ListNode(arr[i ]);
            }else {
                nodes[i] = null;
            }
        }
        ListNode node;
        for (int i = 0; i < nodes.length-1; i++) {
            node = nodes[i];
            node.next=nodes[i+1];
        }
        return nodes[0];
    }

    public static Integer[] ListNodeToArray(ListNode headNode) {
        List<Integer> result = new ArrayList<>();
        while (headNode != null) {
            result.add(headNode.val);
            headNode=headNode.next;
        }
        return result.toArray(new Integer[result.size()]);
    }

    public String toString() {
        Integer[] temp = ListNodeToArray(this);
        return Arrays.toString(temp);
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                ListNode node = curr.next;
                curr.next = node.next;
                node.next = null;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
