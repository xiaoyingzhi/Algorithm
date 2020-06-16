package 算法.牛客;

import java.util.Stack;

/**
 * @author wh
 * @create 2018-10-14 20:13
 **/
public class 面试题30_包含main函数的栈 {
    Stack<Integer> stackMain = new Stack<>();
    Stack<Integer> stackHelp = new Stack<>();

    public void push(int node) {
        stackMain.push(node);
        if (!stackHelp.isEmpty() && node >= stackHelp.peek()) {
            stackHelp.push(stackHelp.peek());
        } else {
            stackHelp.push(node);
        }
    }

    public int pop() {
        stackHelp.pop();
        return stackMain.pop();
    }

    public int top() {
        return stackMain.peek();
    }

    public int min() {
        return stackHelp.peek();
    }
}
