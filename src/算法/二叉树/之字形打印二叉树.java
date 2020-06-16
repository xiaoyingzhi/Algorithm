package 算法.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author wh
 * @create 2018-10-01 11:58
 **/
public class 之字形打印二叉树 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null) {
            return listAll;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.offer(pRoot);
        boolean way = true;
        TreeNode last = pRoot;
        TreeNode nlast = pRoot;
        ArrayList<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            pRoot = queue.poll();
            if (way) {
                list.add(pRoot.val);
            } else {
                stack.push(pRoot.val);
            }

            if (pRoot.left != null) {
                nlast = pRoot.left;
                queue.offer(nlast);
            }
            if (pRoot.right != null) {
                nlast = pRoot.right;
                queue.offer(nlast);
            }
            if (pRoot == last) {
                last = nlast;
                if (way) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.addAll(list);
                    listAll.add(temp);
                    list.clear();
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    while (!stack.isEmpty()) {
                        temp.add(stack.pop());
                    }
                    listAll.add(temp);
                }
                way = !way;
            }
        }
        return listAll;

    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        //Print(n1);
    }
}
