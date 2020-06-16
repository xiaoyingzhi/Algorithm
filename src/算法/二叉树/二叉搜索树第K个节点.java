package 算法.二叉树;

import java.util.Stack;

/**
 * @author wh
 * @create 2018-10-01 13:23
 **/
public class 二叉搜索树第K个节点 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode KthNode(TreeNode head, int k) {
        if (head == null) {
            return null;
        }
        int index = 0;
        Stack<TreeNode> stack = new Stack<>();
        while (head != null || !stack.isEmpty()) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                head = stack.pop();
                if (++index == k) {
                    return head;
                }
                head = head.right;
            }
        }
        return null;
    }
}
