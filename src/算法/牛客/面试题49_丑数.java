package 算法.牛客;

import java.util.ArrayList;

/**
 * @author wh
 * @create 2018-10-16 15:53
 **/
public class 面试题49_丑数 {
    public static int returnUglyNum(int n) {
        if (n <= 0) {
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int x2 = 0;
        int x3 = 0;
        int x5 = 0;
        while (list.size() < n) {
            int temp02 = list.get(x2) * x2;
            int temp03 = list.get(x3) * x3;
            int temp05 = list.get(x5) * x5;
            int min = Math.min(temp02, Math.min(temp03, temp05));
            if (min == temp02) {
                x2++;
            }
            if (min == temp03) {
                x3++;
            }
            if (min == temp05) {
                x5++;
            }
            list.add(min);
        }
        return list.get(list.size() - 1);
    }
}
