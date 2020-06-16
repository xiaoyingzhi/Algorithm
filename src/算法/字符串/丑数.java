package 算法.字符串;

import java.util.ArrayList;

/**
 * @author wh
 * @create 2018-09-25 17:46
 **/
public class 丑数 {
    public static int GetUglyNumber_Solution(int index) {
        if (index == 0) {
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int x2 = 0, x3 = 0, x5 = 0;
        while (list.size() < index) {
            int value2 = list.get(x2) * 2;
            int value3 = list.get(x3) * 3;
            int value5 = list.get(x5) * 5;
            int min = Math.min(value2, Math.min(value3, value5));
            if (min == value2) {
                x2++;
            }
            if (min == value3) {
                x3++;
            }
            if (min == value5) {
                x5++;
            }
            list.add(min);
        }
        // System.out.println(list.size()-1);
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(3));
    }
}
