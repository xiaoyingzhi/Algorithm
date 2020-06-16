package 算法.二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wh
 * @create 2018-09-28 15:19
 **/
public class 打印二叉树的第K层 {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void printK(Node head, int k) {
        if (head == null || k < 0) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        Node last = head;
        Node nlast = head;
        while (k > 0) {
            head = queue.poll();
            if (head.left != null) {
                nlast = head.left;
                queue.offer(nlast);
            }
            if (head.right != null) {
                nlast = head.right;
                queue.offer(nlast);
            }
            if (head == last) {
                last = nlast;
                k--;
            }
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.poll().value + " ");
        }

    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        printK(n1, 2);
    }
}
