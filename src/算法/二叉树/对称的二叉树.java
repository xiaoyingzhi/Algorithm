package 算法.二叉树;

/**
 * @author wh
 * @create 2018-10-01 11:33
 **/
public class 对称的二叉树 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return isB(pRoot.left, pRoot.right);

    }

    public static boolean isB(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        boolean temp = left.val == right.val ? true : false;
        return temp && isB(left.left, right.right) && isB(left.right, right.left);
    }
}
