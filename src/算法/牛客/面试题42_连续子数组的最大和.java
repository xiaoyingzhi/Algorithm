package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-16 15:50
 **/
public class 面试题42_连续子数组的最大和 {
    public static void main(String[] args) {
        System.out.println(returnMaxSun(new int[]{1,-2,3,10,-4,7,2,-5}));
    }
    public static int returnMaxSun(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum >= 0) {
                sum += arr[i];
            } else {
                sum = arr[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
