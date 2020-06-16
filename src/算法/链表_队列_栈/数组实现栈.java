package 算法.链表_队列_栈;

/**
 * @author wh
 * @create 2018-09-28 10:47
 **/
public class 数组实现栈 {
    public static class ArrayToStack {
        int[] arr;
        int index;

        public ArrayToStack(int initSize) {
            if (initSize < 0) {
                throw new IllegalArgumentException("初始值不能小于0");
            }
            arr = new int[initSize];
            index = 0;
        }

        public int peek() {
            if (index == 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return arr[index - 1];
        }

        public int pop() {
            if (index == 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return arr[--index];
        }

        public void push(int obj) {
            if (index == arr.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            arr[index++] = obj;
        }
    }
}
