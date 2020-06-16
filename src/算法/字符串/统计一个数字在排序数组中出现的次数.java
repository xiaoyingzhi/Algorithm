package 算法.字符串;

/**
 * @author wh
 * @create 2018-09-29 17:12
 **/
public class 统计一个数字在排序数组中出现的次数 {
    public int GetNumberOfK(int[] array, int k) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (k == array[i]) {
                index++;
            }
        }
        return index;
    }
}
