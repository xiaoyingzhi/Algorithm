package 算法.牛客;

import java.util.Stack;

/**
 * @author wh
 * @create 2018-10-14 12:53
 **/
public class 面试题06_从尾到头打印链表 {
    public static class Node {
        int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        sysToHead(n1);
    }

    public static void sysToHead(Node node) {
        if (node == null) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
