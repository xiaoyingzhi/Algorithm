package 算法.链表_队列_栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wh
 * @create 2018-09-28 11:59
 **/
public class 两个队列实现栈 {
    public static class QueueToStack<T> {
        Queue<T> qMain;
        Queue<T> qHelp;

        public QueueToStack() {
            qMain = new LinkedList<>();
            qHelp = new LinkedList<>();
        }

        public void push(T obj) {
            qMain.offer(obj);
        }

        public T peek() {
            if (qMain.isEmpty()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            while (qMain.size() != 1) {
                qHelp.offer(qMain.poll());
            }
            T res = qMain.poll();
            qHelp.add(res);
            swap();
            return res;

        }

        public T pop() {
            if (qMain.isEmpty()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            while (qMain.size() != 1) {
                qHelp.offer(qMain.poll());
            }
            T res = qMain.poll();
            swap();
            return res;
        }

        public void swap() {
            Queue<T> temp = qMain;
            qMain = qHelp;
            qHelp = temp;
        }
    }
}
