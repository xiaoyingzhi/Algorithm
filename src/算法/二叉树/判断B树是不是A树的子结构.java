package 算法.二叉树;

/**
 * @author wh
 * @create 2018-09-29 19:12
 **/
public class 判断B树是不是A树的子结构 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return checkB(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    public boolean checkB(TreeNode node1, TreeNode node2) {
        if (node2 == null) {
            return true;
        }
        if (node1 == null || node1.val != node2.val) {
            return false;
        }
        return checkB(node1.left, node2.left) && checkB(node1.right, node2.right);
    }
}
