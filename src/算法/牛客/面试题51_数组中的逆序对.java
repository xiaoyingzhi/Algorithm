package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-16 15:55
 **/
public class 面试题51_数组中的逆序对 {
    public static void main(String[] args) {
        System.out.println(returnReverse(new int[]{7, 5, 6, 4}));
    }

    public static int returnReverse(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        return msort(arr, 0, arr.length - 1);
    }

    public static int msort(int[] arr, int L, int R) {
        if (L == R) {
            return 0;
        }
        int mid = (R + L) / 2;
        return msort(arr, L, mid) + msort(arr, mid + 1, R) + merge(arr, L, mid, R);
    }

    public static int merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R - L + 1];
        int pL = L;
        int pR = mid + 1;
        int index = 0;
        int res = 0;
        while (pL <= mid && pR <= R) {
            res += arr[pL] > arr[pR] ? (R - pR + 1) : 0;
            help[index++] = arr[pL] <= arr[pR] ? arr[pL++] : arr[pR++];
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
        return res;
    }
}
