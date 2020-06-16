package 算法.牛客;

import java.util.Stack;

/**
 * @author wh
 * @create 2018-10-14 20:06
 **/
public class 面试题31_栈的压入弹出序列 {
    public static void main(String[] args) {
        System.out.println(isTrue(new int[]{1,2,3,4,5},new int[]{4,5,3,2,1}));
    }
    public static boolean isTrue(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i > a.length; i++) {
            stack.push(a[i]);
            if (a[i] == b[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
