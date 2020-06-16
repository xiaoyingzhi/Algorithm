package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 20:12
 **/
public class 面试题28_对称的二叉树 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isB(TreeNode node) {
        if (node == null) {
            return false;
        }
        return check(node.left, node.right);
    }

    public static boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        boolean temp = left.val == right.val;
        return temp && check(left.left, right.right) && check(left.right, right.left);
    }
}
