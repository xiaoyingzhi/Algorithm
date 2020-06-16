package 算法.排序;

/**
 * @author wh
 * @create 2018-10-02 12:36
 **/
public class 归并排序 {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }
        mSort(arr, 0, arr.length - 1);
    }

    public static void mSort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = (L + R) / 2;
        mSort(arr, L, mid);
        mSort(arr, mid + 1, R);
        merge(arr, L, mid, R);

    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R - L + 1];
        int pL = L;
        int pR = mid + 1;
        int index = 0;
        while (pL <= mid && pR <= R) {
            help[index++] = arr[pL] < arr[pR] ? arr[pL++] : arr[pR++];
        }
        while (pL <= mid) {
            help[index++] = arr[pL++];
        }
        while (pR <= R) {
            help[index++] = arr[pR++];
        }
        for (int i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }
}
