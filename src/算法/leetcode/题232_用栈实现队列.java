package 算法.leetcode;

import java.util.Stack;

/**
 * @author wangheng
 * @date 2020-06-16
 */
public class 题232_用栈实现队列 {
}

class MyQueue {

    private Stack<Integer> mainStack;
    private Stack<Integer> helpStack;
    private int front;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        mainStack = new Stack<>();
        helpStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (mainStack.isEmpty()) {
            front = x;
        }
        mainStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (helpStack.isEmpty()) {
            while (!mainStack.isEmpty()) {
                helpStack.push(mainStack.pop());
            }
        }
        if (helpStack.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return helpStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (empty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return helpStack.isEmpty() ? front : helpStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return mainStack.isEmpty() && helpStack.isEmpty();
    }
}
