package 算法.排序;

/**
 * @author wh
 * @create 2018-10-16 16:19
 **/
public class 归并排序练习 {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        msort(arr, 0, arr.length - 1);
    }

    public static void msort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = (R + L) / 2;
        msort(arr, L, mid);
        msort(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int pL = L;
        int pR = mid + 1;
        int index = 0;
        while (pL <= mid && pR <= R) {
            temp[index++] = arr[pL] <= arr[pR] ? arr[pL++] : arr[pR++];
        }
        while (pL <= mid) {
            temp[index++] = arr[pL++];
        }
        while (pR <= R) {
            temp[index++] = arr[pR++];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[L + i] = temp[i];
        }
    }
}
