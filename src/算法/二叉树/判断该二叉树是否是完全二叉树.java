package 算法.二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wh
 * @create 2018-09-29 17:17
 **/
public class 判断该二叉树是否是完全二叉树 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean isB = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            TreeNode l = root.left;
            TreeNode r = root.right;
            if (isB && (l != null || r != null) || (l == null && r != null)) {
                return false;
            }
            if (l != null) {
                queue.offer(l);
            }
            if (r != null) {
                queue.offer(r);
            }
            if (l != null && r == null) {
                isB = true;
            }
        }
        return true;
    }
}
