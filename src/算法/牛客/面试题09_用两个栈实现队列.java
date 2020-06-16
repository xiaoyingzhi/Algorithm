package 算法.牛客;

import java.util.Stack;

/**
 * @author wh
 * @create 2018-10-14 12:54
 **/
public class 面试题09_用两个栈实现队列 {
    public static class stackToQueue<T> {
        Stack<T> stackMain = null;
        Stack<T> stackHelp = null;

        public stackToQueue() {
            stackMain = new Stack<>();
            stackHelp = new Stack<>();
        }

        public void offer(T obj) {
            stackMain.push(obj);
        }

        public T peek() {
            swap();
            if (stackHelp.isEmpty()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return stackHelp.peek();
        }

        public T poll() {
            if (stackHelp.isEmpty()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            swap();
            return stackHelp.pop();
        }

        private void swap() {
            while (stackHelp.isEmpty()) {
                while (!stackMain.isEmpty()) {
                    stackHelp.push(stackMain.pop());
                }
            }
        }
    }

}
