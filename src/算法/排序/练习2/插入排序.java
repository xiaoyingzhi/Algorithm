package 算法.排序.练习2;

import 算法.排序.SortUtil;

import java.util.Arrays;

/**
 * @author wangheng
 * @date 2020-06-18
 */
public class 插入排序 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 7, 9, 1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                SortUtil.swap(arr, j, j + 1);
            }
        }
    }
}
