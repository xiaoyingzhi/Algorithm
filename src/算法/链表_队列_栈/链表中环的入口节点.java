package 算法.链表_队列_栈;

/**
 * @author wh
 * @create 2018-10-01 10:58
 **/
public class 链表中环的入口节点 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode qu = pHead;
        ListNode sl = pHead;
        while (qu != null) {
            if (qu.next == null || qu.next.next == null) {
                return null;
            }
            qu = qu.next.next;
            sl = sl.next;
            if (qu == sl) {
                qu = pHead;
                break;
            }
        }
        while (qu != sl) {
            qu = qu.next;
            sl = sl.next;
        }
        return qu;
    }
}
