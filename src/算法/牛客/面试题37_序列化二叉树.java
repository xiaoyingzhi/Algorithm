package 算法.牛客;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wh
 * @create 2018-10-14 20:17
 **/
public class 面试题37_序列化二叉树 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static String serialize(TreeNode head) {
        if (head == null) {
            return "#!";
        }
        String res = head.val + "!";
        res += serialize(head.left);
        res += serialize(head.right);
        return res;
    }

    public static TreeNode reconTree(String str) {
        String[] split = str.split("!");
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < split.length; i++) {
            queue.offer(split[i]);
        }
        return recon(queue);
    }

    public static TreeNode recon(Queue<String> queue) {
        String str = queue.poll();
        if (str.equals("#")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(str));
        node.left = recon(queue);
        node.right = recon(queue);
        return node;
    }
}
