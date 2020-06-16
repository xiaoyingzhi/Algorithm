package 算法.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wangheng
 * @date 2020-06-16
 */
public class 题225_用队列实现栈 {

    public static void main(String[] args) {
        MyStack obj = new MyStack();

    }

}

class MyStack {

    private Queue<Integer> mainQ;
    private Queue<Integer> helpQ;
    private int top;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        mainQ = new LinkedList<>();
        helpQ = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        top = x;
        mainQ.offer(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (mainQ.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        while (mainQ.size() > 1) {
            top = mainQ.poll();
            helpQ.offer(top);
        }
        Integer tmp = mainQ.poll();
        swap();
        return tmp;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return top;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return mainQ.isEmpty();
    }

    private void swap() {
        Queue<Integer> tmp = mainQ;
        mainQ = helpQ;
        helpQ = tmp;
    }
}
