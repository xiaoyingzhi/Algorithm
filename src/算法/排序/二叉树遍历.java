package 算法.排序;

import 算法.二叉树.递归遍历和非递归遍历二叉树.Node;

import java.util.Stack;

/**
 * @author wh
 * @create 2018-10-02 14:17
 **/
public class 二叉树遍历 {
    public static void pre(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.value + " ");
        pre(head.left);
        pre(head.right);
    }

    public static void pre02(Node head) {
        if (head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        while (head != null) {
            head = stack.pop();
            System.out.println(head.value + " ");
            if (head.right != null) {
                stack.push(head.right);
            }
            if (head.left != null) {
                stack.push(head.left);
            }
        }
    }

    public static void in02(Node head) {
        if (head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                head = stack.pop();
                System.out.println(head.value + " ");
                head = head.right;
            }
        }
    }
}
