package 算法.排序;

/**
 * @author wangheng
 * @date 2020-06-18
 */
public class SortUtil {

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
