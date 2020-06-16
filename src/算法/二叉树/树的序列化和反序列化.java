package 算法.二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wh
 * @create 2018-10-01 13:04
 **/
public class 树的序列化和反序列化 {

    String Serialize(TreeNode root) {
        if (root == null) {
            return "#!";
        }
        String res = root.val + "!";
        res += Serialize(root.left);
        res += Serialize(root.right);
        return res;
    }

    TreeNode Deserialize(String str) {
        String[] split = str.split("!");
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < split.length; i++) {
            queue.offer(split[i]);
        }
        return builderTree(queue);
    }

    public static TreeNode builderTree(Queue<String> queue) {
        String value = queue.poll();
        if (value.equals("#")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(value));
        node.left = builderTree(queue);
        node.right = builderTree(queue);
        return node;
    }
}
