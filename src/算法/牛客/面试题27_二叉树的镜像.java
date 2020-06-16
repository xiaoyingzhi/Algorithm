package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 20:12
 **/
public class 面试题27_二叉树的镜像 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode mirrorTree(TreeNode head){
        if (head==null){
            return null;
        }
        head.right=mirrorTree(head.left);
        head.left=mirrorTree(head.right);
        return head;
    }
}
