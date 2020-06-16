package 算法.二叉树;

/**
 * @author wh
 * @create 2018-09-29 17:37
 **/
public class 判断该二叉树是否是平衡二叉树 {
    public boolean IsBalanced_Solution(TreeNode root) {
        boolean[] res = new boolean[1];
        res[0] = true;
        isB(root, 0, res);
        return res[0];

    }

    public int isB(TreeNode head, int leavel, boolean[] res) {
        if (head == null) {
            return leavel;
        }
        int lH = isB(head.left, leavel + 1, res);
        if (!res[0]) {
            return leavel;
        }
        int rH = isB(head.right, leavel + 1, res);
        if (!res[0]) {
            return leavel;
        }
        if (Math.abs(rH - lH) > 1) {
            res[0] = false;
        }
        return Math.max(lH, rH);
    }
}
