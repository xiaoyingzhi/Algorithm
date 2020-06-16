package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 12:54
 **/
public class 面试题07_重建二叉树 {
    public static class Node {
        int val;
        Node left = null;
        Node right = null;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        Node node = buildTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        perOrderRecur(node);

    }

    public static Node buildTree(int[] pre, int preLeft, int preRight, int[] in, int inLeft, int inRight) {
        if (pre.length == 0 || in.length == 0 || preLeft > preRight || inLeft > inRight) {
            return null;
        }
        Node root = new Node(pre[preLeft]);
        for (int i = inLeft; i <= inRight; i++) {
            if (in[i] == pre[preLeft]) {
                root.left = buildTree(pre, preLeft + 1, i, in, inLeft, i - 1);
                root.right = buildTree(pre, preLeft + i + 1, preRight, in, i + 1, inRight);
            }
        }
        return root;
    }

    public static void perOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        perOrderRecur(head.left);
        perOrderRecur(head.right);
    }
}
