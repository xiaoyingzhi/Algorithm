package 算法.字符串;

/**
 * @author wh
 * @create 2018-09-25 13:51
 **/
public class 最大连续子序列的和 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        int temp = array[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (temp <= 0) {
                temp = array[i];
            } else {
                temp += array[i];
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}
