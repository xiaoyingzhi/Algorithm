package 算法.牛客;


/**
 * @author wh
 * @create 2018-10-14 20:11
 **/
public class 面试题26_树的子结构 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isSun(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return check(A, B) || isSun(A.right, B) || isSun(A.left, B);
    }

    public static boolean check(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null || A.val != B.val) {
            return false;
        }
        return check(A.left, B.left) && check(A.right, B.right);
    }
}
