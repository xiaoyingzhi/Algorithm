package 算法.链表_队列_栈;

import java.util.Stack;

/**
 * @author wh
 * @create 2018-09-28 10:55
 **/
public class 两个栈实现队列 {
    public static class StackToQueue<T> {
        Stack<T> stackMain;
        Stack<T> stackHelp;

        public StackToQueue() {
            stackMain = new Stack<>();
            stackHelp = new Stack<>();
        }

        public void add(T obj) {
            stackMain.push(obj);
        }

        public T peek() {
            mainToHelp();
            if (stackHelp.isEmpty()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return stackHelp.peek();

        }

        public T poll() {
            mainToHelp();
            if (stackHelp.isEmpty()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return stackHelp.pop();
        }

        public void mainToHelp() {
            if (stackHelp.isEmpty()) {
                while (!stackMain.isEmpty()) {
                    stackHelp.push(stackMain.pop());
                }
            }
        }

    }
}
