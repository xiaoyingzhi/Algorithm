package 算法.排序.练习2;

import java.util.Arrays;

/**
 * @author wangheng
 * @date 2020-06-18
 */
public class 选择排序 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 7, 9, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
