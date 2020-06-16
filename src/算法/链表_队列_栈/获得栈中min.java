package 算法.链表_队列_栈;

import java.util.Stack;

/**
 * @author wh
 * @create 2018-09-24 12:54
 **/
public class 获得栈中min {
    Stack<Integer> stackMain = new Stack<>();
    Stack<Integer> stackHelp = new Stack<>();

    public static void main(String[] args) {

    }

    public void push(int node) {
        stackMain.push(node);
        if (!stackHelp.isEmpty() && node >= stackHelp.peek()) {
            stackHelp.push(stackHelp.peek());
        } else {
            stackHelp.push(node);
        }
    }

    public void pop() {
        stackMain.pop();
        stackHelp.pop();
    }

    public int top() {
        return stackMain.peek();
    }

    public int min() {
        return stackHelp.peek();
    }
}
