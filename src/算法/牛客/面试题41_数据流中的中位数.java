package 算法.牛客;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author wh
 * @create 2018-10-16 15:49
 **/
public class 面试题41_数据流中的中位数 {
    public static PriorityQueue<Integer> min = new PriorityQueue<>();
    public static PriorityQueue<Integer> max = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    public static void Insert(Integer obj) {
        if (!max.isEmpty() && obj > max.peek()) {
            min.add(obj);
        } else {
            max.add(obj);
        }
        if (max.size() - min.size() > 2) {
            min.add(max.poll());
        }
        if (min.size() - max.size() > 2) {
            max.add(min.poll());
        }
    }

    public static Double GetMedian() {
        if (max.size() > min.size()) {
            return (double) max.peek();
        } else if (max.size() < min.size()) {
            return (double) min.peek();
        } else {
            return ((double) max.peek() + min.peek()) / 2;
        }
    }
}
