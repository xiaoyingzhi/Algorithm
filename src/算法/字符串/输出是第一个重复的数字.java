package 算法.字符串;

import java.util.HashSet;

/**
 * @author wh
 * @create 2018-09-29 20:51
 **/
public class 输出是第一个重复的数字 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (set.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                set.add(numbers[i]);
            }
        }
        return false;
    }
}
