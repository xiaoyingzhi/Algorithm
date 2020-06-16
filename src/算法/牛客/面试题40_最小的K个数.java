package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-16 15:49
 **/

/**
 * 查找的是第K小的数
 */
public class 面试题40_最小的K个数 {
    public static void main(String[] args) {
        System.out.println(quickSort(new int[]{1, 2, 3, 4, 5, 6}, 6));
    }

    public static int quickSort(int[] arr, int k) {
        if (arr == null || k > arr.length) {
            return 0;
        }
        return partition(arr, k - 1, 0, arr.length - 1);
    }

    public static int partition(int[] arr, int k, int start, int end) {
        int left = start - 1;
        int right = end + 1;
        int index = 0;
        while (index < right) {
            if (arr[index] <= arr[end]) {
                swap(arr, ++left, index++);
            } else {
                swap(arr, --right, index);
            }
        }
        if (left == k) {
            return arr[left];
        } else if (left > k) {
            return partition(arr, k, start, left - 1);
        } else {
            return partition(arr, k, left + 1, end);
        }

    }

    public static void swap(int[] nums, int n1, int n2) {
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }
}
