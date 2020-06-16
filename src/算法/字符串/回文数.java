package 算法.字符串;

import java.util.Stack;

/**
 * @author wh
 * @create 2018-09-24 10:43
 **/

public class 回文数 {
    public static void main(String[] args) {
        isHw(1212);

    }

    /**
     * leetCode.09
     *
     * @param x
     */
    public static boolean isHw(int x) {
        String str = x + "";
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
