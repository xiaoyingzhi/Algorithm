package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 12:55
 **/
public class 面试题11_旋转数组的最小数字 {
    public static void main(String[] args) {
        System.out.println(returnSmall(new int[]{3, 4, 5, 1, 2}));
    }

    public static int returnSmall(int[] arr) {
        if (arr.length <= 2) {
            return arr[0];
        }
        int left = 0;
        int right = arr.length - 1;
        int mid = left;
        while (arr[left] >= arr[right]) {
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = (left + right) >> 1;
            if (arr[mid] >= arr[left]) {
                left = mid;
            } else if (arr[mid] <= arr[right]) {
                right = mid;
            }
        }
        return arr[mid];
    }
}
