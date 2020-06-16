package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-16 12:48
 **/
public class 面试题22_链表中倒数第K个节点 {
    public static class Node {
        int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }

    public static void printNodeK(Node head, int k) {
        if (head == null || k <= 0) {
            return;
        }
        Node fast = head;
        Node slow = head;
        for (int i = 1; i < k; i++) {
            if (fast.next == null) {
                return;
            } else {
                fast = fast.next;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(slow.val);
    }
}
