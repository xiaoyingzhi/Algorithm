package 算法.排序;

/**
 * @author wh
 * @create 2018-10-02 11:50
 **/
public class 选择排序 {
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
            }
            swap(arr, i, temp);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

//    public static void slect(int[] arr){
//        for (int i = 0;i<arr.length-1;i++){
//            int index = i;
//            for (int j = i+1;i<arr.length;j++){
//                if (arr[j]>arr[index]){
//                    index =j;
//                }
//            }
//            swap(arr,i,index);
//        }
//    }
}
