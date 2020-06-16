package 算法.字符串;

import java.util.Stack;

/**
 * @author wh
 * @create 2018-09-24 13:10
 **/
public class 判断压栈弹出栈的顺序是否合法 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length != popA.length || pushA.length == 0 || popA.length == 0) {
            return false;
        }
        Stack<Integer> stackHelp = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            stackHelp.push(pushA[i]);
            while (!stackHelp.isEmpty() && stackHelp.peek() == popA[index]) {
                stackHelp.pop();
                index++;
            }
        }
        return stackHelp.isEmpty();
    }
}
