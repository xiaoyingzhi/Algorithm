package 算法.字符串;

/**
 * @author wh
 * @create 2018-09-30 14:10
 **/
public class 删除排序链表的重复节点 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode node = null;
        ListNode head = pHead;
        while (head != null) {
            node = head.next;
            if (node != null) {
                if (head.val == node.val) {
                    head.next = node.next;
                    node.next = null;
                }
            }
            head = head.next;
        }
        return pHead;
    }
}
