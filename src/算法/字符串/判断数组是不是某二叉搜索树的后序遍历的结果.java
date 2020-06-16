package 算法.字符串;

/**
 * @author wh
 * @create 2018-09-24 13:36
 **/
public class 判断数组是不是某二叉搜索树的后序遍历的结果 {

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return isBST(sequence, 0, sequence.length - 1);

    }

    public static boolean isBST(int[] sequence, int start, int end) {
        if (end <= start) {
            return true;
        }
        int i = start;
        for (; i < end; i++) {
            if (sequence[i] > sequence[end]) {
                break;
            }
        }
        for (int j = i; j < end; j++) {
            if (sequence[j] < sequence[end]) {
                return false;
            }
        }
        return isBST(sequence, start, i - 1) && isBST(sequence, i, end - 1);
    }
}
