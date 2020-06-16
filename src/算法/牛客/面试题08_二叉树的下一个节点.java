package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 12:54
 **/
public class 面试题08_二叉树的下一个节点 {
    public static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }

    public static TreeLinkNode returnNext(TreeLinkNode node) {
        if (node == null) {
            return null;
        }
        if (node.right != null) {
            node = node.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
        while (node.next != null) {
            if (node.next.left == node) {
                return node.next;
            }
            node = node.next;
        }
        return null;

    }
}
