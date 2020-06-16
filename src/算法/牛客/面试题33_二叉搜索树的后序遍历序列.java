package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 20:15
 **/
public class 面试题33_二叉搜索树的后序遍历序列 {

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return isBST(sequence, 0, sequence.length - 1);

    }

    public static boolean isBST(int[] arr, int start, int end) {
        if (end <= start) {
            return false;
        }
        int i = start;
        for (; i < end; i++) {
            if (arr[i] > arr[end]) {
                break;
            }
        }
        for (int j = i; j < end; j++) {
            if (arr[j] < arr[end]) {
                return false;
            }
        }
        return isBST(arr, start, i - 1) && isBST(arr, i, end);
    }
}
