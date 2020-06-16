package 算法.排序;

/**
 * @author wh
 * @create 2018-10-02 11:42
 **/
public class 冒泡排序 {
    public static void bubbleSort(int[] arr) {
        for (int e = arr.length - 1; e > 0; e--) {
            for (int j = 0; j < e; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
//
//    public static void bubble(int[] arr) {
//        for (int i = arr.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    swap(arr, j, j + 1);
//                }
//            }
//        }
//    }
}
