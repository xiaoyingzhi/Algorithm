package 算法.leetcode;

import java.util.Stack;

/**
 * @author wangheng
 * @date 2020-06-16
 */
public class 题2_有效的括号 {

    public boolean isValid(String s) {
        if (s == null || "".equals(s)) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
