package 算法.字符串;

/**
 * @author wh
 * @create 2018-09-25 12:42
 **/
public class 找出数组中超过半数的数 {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        int temp = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == temp) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    temp = array[i];
                    count = 1;
                }
            }
        }

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == temp) {
                num++;
            }
        }
        if (num > array.length / 2) {
            return temp;
        } else {
            return 0;
        }
    }
}
