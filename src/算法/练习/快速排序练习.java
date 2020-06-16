package 算法.练习;

/**
 * @author wh
 * @create 2018-10-16 16:33
 **/
public class 快速排序练习 {
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        qsort(arr, 0, arr.length - 1);
    }

    public static void qsort(int[] arr, int L, int R) {
        if (L < R) {
            int[] partition = partition(arr, L, R);
            qsort(arr, L, partition[0] - 1);
            qsort(arr, partition[1] + 1, R);

        }
    }

    public static int[] partition(int[] arr, int L, int R) {
        int left = L - 1;
        int right = R + 1;
        int index = L;
        while (index < R) {
            if (arr[index] < arr[R]) {
                swap(arr, ++left, index++);
            } else if (arr[index] > arr[R]) {
                swap(arr, --right, index);
            } else {
                index++;
            }
        }
        return new int[]{left + 1, right - 1};
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
