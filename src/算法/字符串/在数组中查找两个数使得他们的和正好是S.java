package 算法.字符串;

import java.util.ArrayList;

/**
 * @author wh
 * @create 2018-09-29 18:51
 **/
public class 在数组中查找两个数使得他们的和正好是S {
    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array.length == 0) {
            return list;
        }

        int left = 0;
        int right = array.length - 1;
        while (left != right) {
            if (array[left] + array[right] > sum) {
                right--;
            } else if (array[left] + array[right] < sum) {
                left++;
            } else {
                list.add(array[left]);
                list.add(array[right]);
                return list;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 16};
        FindNumbersWithSum(arr, 10);
    }
}
