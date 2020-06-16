package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 20:10
 **/
public class 面试题23_链表中环的入口节点 {
    public static class Node {
        int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node returnNode(Node head) {
        if (head == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null) {
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                break;
            }
        }
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
