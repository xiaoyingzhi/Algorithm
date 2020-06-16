package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-16 15:48
 **/
public class 面试题39_数组中出现次数超过一半的数字 {
    public static void main(String[] args) {

    }

    public static int returnMost(int[] arr) {
        int temp = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (temp == arr[i]) {
                count++;
            } else {
                if (--count == 0) {
                    temp = arr[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return temp;
        }
        return 0;
    }
}
