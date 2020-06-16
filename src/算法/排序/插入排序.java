package 算法.排序;

/**
 * @author wh
 * @create 2018-10-02 11:46
 **/
public class 插入排序 {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    public static void insert(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
//                swap(arr, j, j + 1);
//            }
//        }
//    }
}
