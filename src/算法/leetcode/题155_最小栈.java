package 算法.leetcode;

import java.util.Stack;

/**
 * @author wangheng
 * @date 2020-06-16
 */
public class 题155_最小栈 {

    class MinStack {

        private Stack<Integer> mainStack;

        private Stack<Integer> helpStack;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            mainStack = new Stack<>();
            helpStack = new Stack<>();
        }

        public void push(int x) {
            mainStack.push(x);
            if (helpStack.isEmpty() || helpStack.peek() > x) {
                helpStack.push(x);
            } else {
                helpStack.push(helpStack.peek());
            }
        }

        public void pop() {
            if (mainStack.isEmpty()) {
                throw new RuntimeException("size is 0");
            }
            mainStack.pop();
            helpStack.pop();
        }

        public int top() {
            if (mainStack.isEmpty()) {
                throw new RuntimeException("size is 0");
            }
            return mainStack.peek();
        }

        public int getMin() {
            if (mainStack.isEmpty()) {
                throw new RuntimeException("size is 0");
            }
            return helpStack.peek();
        }
    }
}
