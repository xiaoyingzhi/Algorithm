package 算法.练习;

/**
 * @author wh
 * @create 2018-10-02 12:45
 **/
public class 快速排序 {
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        qSort(arr, 0, arr.length - 1);
    }

    public static void qSort(int[] arr, int L, int R) {
        if (L < R) {
            int[] p = partition(arr, L, R);
            qSort(arr, L, p[0] - 1);
            qSort(arr, p[1] + 1, R);
        }
    }

    public static int[] partition(int arr[], int L, int R) {
        int less = L - 1;
        int more = R + 1;
        while (L < R) {
            if (arr[L] < arr[R]) {
                swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {
                swap(arr, --more, L);
            } else {
                L++;
            }
        }
        return new int[]{less + 1, more - 1};
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
