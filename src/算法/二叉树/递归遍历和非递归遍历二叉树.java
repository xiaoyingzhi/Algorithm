package 算法.二叉树;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author wh
 * @create 2018-09-28 12:24
 **/
public class 递归遍历和非递归遍历二叉树 {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void print(Node head, int k) {
        if (head == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        Node last = head;
        queue.offer(head);
        while (!queue.isEmpty()) {
            if (k == 1) {
                System.out.print(queue.poll().value);
            } else {
                Node node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (last == node) {
                    k--;
                    last = node.left == null ? node.right : node.left;
                }
            }
        }
    }

    /**
     * 递归先序遍历
     *
     * @param head
     */
    public static void perOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.value + " ");
        perOrderRecur(head.left);
        perOrderRecur(head.right);
    }

    /**
     * 递归中序遍历
     *
     * @param head
     */
    public static void inOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        perOrderRecur(head.left);
        System.out.println(head.value + " ");
        perOrderRecur(head.right);
    }

    /**
     * 递归后序遍历
     *
     * @param head
     */
    public static void posOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        perOrderRecur(head.left);
        perOrderRecur(head.right);
        System.out.println(head.value + " ");
    }

    /**
     * 非递归层序遍历
     *
     * @param head
     */
    public static void ceng(Node head) {
        if (head == null) {
            return;
        }
        Node temp = null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            temp = queue.poll();
            System.out.print(temp.value + " ");
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    /**
     * 非递归先序遍历
     *
     * @param head
     */
    public static void per(Node head) {
        if (head == null) {
            return;
        }
        Node temp = null;
        Stack<Node> stack = new Stack<>();
        stack.add(head);
        while (!stack.isEmpty()) {
            temp = stack.pop();
            System.out.print(temp.value + " ");
            if (temp.right != null) {
                stack.add(temp.right);
            }
            if (temp.left != null) {
                stack.add(temp.left);
            }

        }
    }

    /**
     * 非递归先中序遍历
     *
     * @param head
     */
    public static void in(Node head) {
        if (head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        while (head != null || !stack.isEmpty()) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                head = stack.pop();
                System.out.print(head.value + " ");
                head = head.right;
            }
        }
    }

    /**
     * 非递归先后序遍历
     *
     * @param head
     */
    public static void pos(Node head) {
        if (head == null) {
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.add(head);
        while (!stack1.isEmpty()) {
            head = stack1.pop();
            stack2.add(head);
            if (head.left != null) {
                stack1.add(head.left);
            }
            if (head.right != null) {
                stack1.add(head.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop().value + " ");
        }
    }

    public static void main(String[] args) {
//        Node n1=new Node(1);
//        Node n2=new Node(2);
//        Node n3=new Node(3);
//        Node n4=new Node(4);
//        Node n5=new Node(5);
//        Node n6=new Node(6);
//        Node n7=new Node(7);
//        n1.left=n2;
//        n1.right=n3;
//        n2.left=n4;
//        n2.right=n5;
//        n3.left=n6;
//        n3.right=n7;
//        printK(n1,2);
    }
}
