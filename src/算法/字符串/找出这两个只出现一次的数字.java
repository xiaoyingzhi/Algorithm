package 算法.字符串;

import java.util.HashSet;

/**
 * @author wh
 * @create 2018-09-29 17:53
 **/
public class 找出这两个只出现一次的数字 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                set.remove(array[i]);
            } else {
                set.add(array[i]);
            }
        }
        int index = 0;
        for (Integer s : set) {
            if (index == 0) {
                num1[0] = s;
                index++;
            } else {
                num2[0] = s;
            }

        }

    }
}
