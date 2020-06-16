package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 20:10
 **/
public class 面试题24_反转链表 {
    public static class Node {
        int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node reveserNode(Node head) {
        if (head == null) {
            return null;
        }
        Node next = null;
        Node pre = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = next;
            head = next;
        }
        return pre;
    }
}
