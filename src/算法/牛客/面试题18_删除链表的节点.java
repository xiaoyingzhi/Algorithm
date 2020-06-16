package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 20:07
 **/
public class 面试题18_删除链表的节点 {
    public static class Node {
        int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }

    public static Node deleteNode(Node head, Node delNode) {
        if (head == delNode) {
            head = null;
            return head;
        }
        Node temp = head;
        if (delNode.next == null) {
            while (temp.next != delNode) {
                temp = temp.next;
            }
            temp.next = delNode.next;
            return head;
        }
        delNode.val = delNode.next.val;
        delNode.next = delNode.next.next;
        delNode.next = null;
        return head;
    }
}
