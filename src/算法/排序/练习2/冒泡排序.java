package 算法.排序.练习2;

import java.util.Arrays;

/**
 * @author wangheng
 * @date 2020-06-18
 */
public class 冒泡排序 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 3, 7, 9, 8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
