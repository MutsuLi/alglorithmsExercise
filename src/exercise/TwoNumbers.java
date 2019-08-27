package exercise;


public class TwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    //leetcode 67
    public static String addBinary(String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        for (int i = s1.length() - 1, j = s2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = carry;
            sum += (i >= 0) ? s1.charAt(i) - '0' : 0;
            sum += (j >= 0) ? s2.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            ans.append(carry);
        }
        return ans.reverse().toString();
    }

}
