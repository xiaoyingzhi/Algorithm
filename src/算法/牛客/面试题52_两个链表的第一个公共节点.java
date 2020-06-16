package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-16 15:56
 **/
public class 面试题52_两个链表的第一个公共节点 {
    public static class Node {
        int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node returnSameNode(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        int len1 = 0;
        int len2 = 0;
        Node temp = head1;
        while (temp != null) {
            temp = temp.next;
            len1++;
        }
        temp = head2;
        while (temp != null) {
            temp = temp.next;
            len2++;
        }
        if (len1 > len2) {
            int key = len1 - len2;
            while (key-- != 0) {
                head1 = head1.next;
            }
        } else if (len2 > len1) {
            int key = len2 - len1;
            while (key-- != 0) {
                head2 = head2.next;
            }
        }
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }
}
