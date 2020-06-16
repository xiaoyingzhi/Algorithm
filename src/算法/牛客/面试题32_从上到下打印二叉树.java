package 算法.牛客;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wh
 * @create 2018-10-14 20:14
 **/
public class 面试题32_从上到下打印二叉树 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void printTree(TreeNode head) {
        if (head == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            head = queue.poll();
            System.out.println(head.val);
            if (head.left != null) {
                queue.add(head.left);
            }
            if (head.right != null) {
                queue.add(head.right);
            }
        }
    }

    public static void printTreeK(TreeNode head, int k) {
        if (head == null || k < 0) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode last = head;
        TreeNode nlast = head;
        queue.add(head);
        while (k > 0) {
            head = queue.poll();
            if (head.left != null) {
                nlast = head.left;
                queue.add(nlast);
            }
            if (head.right != null) {
                nlast = head.right;
                queue.add(nlast);
            }
            if (head == last) {
                last = nlast;
                k--;
            }
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.poll().val + " ");
        }
    }
}
