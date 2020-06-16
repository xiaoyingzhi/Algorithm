package 算法.二叉树;

import java.util.ArrayList;

/**
 * @author wh
 * @create 2018-09-25 10:16
 **/
public class 打印出二叉树中结点值的和为输入整数的所有路径 {
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return listAll;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            listAll.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        return listAll;
    }

}
