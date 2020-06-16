package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 12:35
 **/
public class 面试题03_数组中重复的数字 {
    public static void main(String[] args) {
        System.out.println(returnRepeat(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }

    public static int returnRepeat(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i) {
                if (arr[arr[i]] == arr[i]) {
                    return arr[i];
                } else {
                    swap(arr, i, arr[i]);
                }
            }
        }
        return 0;
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
