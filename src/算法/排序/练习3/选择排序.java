package 算法.排序.练习3;

import 算法.排序.SortUtil;

import java.util.Arrays;

/**
 * @author wangheng
 * @date 2020-06-19
 */
public class 选择排序 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 7, 9, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            SortUtil.swap(arr, minIndex, i);
        }
    }
}
