package 算法.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wh
 * @create 2018-09-24 13:20
 **/
public class 层序遍历二叉树 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        TreeNode head = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(head);
        while (!queue.isEmpty()) {
            head = queue.poll();
            list.add(head.val);
            if (head.left != null) {
                queue.offer(head.left);
            }
            if (head.right != null) {
                queue.offer(head.right);
            }
        }
        return list;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
