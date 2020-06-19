package 算法.排序.练习3;

import 算法.排序.SortUtil;

import java.util.Arrays;

/**
 * @author wangheng
 * @date 2020-06-19
 */
public class 冒泡排序 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 3, 7, 9, 8, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortUtil.swap(arr, j, j + 1);
                }
            }
        }
    }

}
