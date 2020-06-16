package 算法.牛客;

import java.util.Arrays;

/**
 * @author wh
 * @create 2018-10-14 20:09
 **/
public class 面试题21_调整数组顺序使基数位位于偶数前面 {
    public static void main(String[] args) {
        int[] arr ={1,4,6,8,3,2,5,9};
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void partition(int[] arr){
        int left = -1;
        int right = arr.length;
        int index =0;
        while (left<right){
            if(arr[index]%2==1){
                swap(arr,++left,index++);
            }else {
                swap(arr,--right,index);
            }
        }
    }
    public static void  swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
