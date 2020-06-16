package 算法.链表_队列_栈;

/**
 * @author wh
 * @create 2018-09-28 10:36
 **/
public class 数组实现队列 {
    public static class ArrayToQueue {
        int[] arr;
        int start;
        int end;
        int size;

        public ArrayToQueue(int initSize) {
            if (initSize < 0) {
                throw new IllegalArgumentException("初始值不能比0小");
            }
            arr = new int[initSize];
            start = 0;
            end = 0;
            size = 0;
        }

        public void add(int obj) {
            if (size == arr.length) {
                throw new ArrayIndexOutOfBoundsException("队列已经满了");
            }
            size++;
            arr[end] = obj;
            end = end == arr.length - 1 ? 0 : end + 1;
        }

        public int poll() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException("队列已经空了");
            }
            size--;
            int temp = start;
            start = start == arr.length - 1 ? 0 : start + 1;
            return arr[temp];
        }

        public Integer peek() {
            if (size == 0) {
                return null;
            }
            return arr[start];
        }
    }
}
