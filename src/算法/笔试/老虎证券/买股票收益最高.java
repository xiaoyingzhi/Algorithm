package 算法.笔试.老虎证券;

import java.util.Scanner;

/**
 * @author wh
 * @create 2018-10-13 9:53
 **/
public class 买股票收益最高 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int[] nums = new int[split.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.valueOf(split[i]);
        }
        System.out.println(returnMax(nums, 10000));
    }

    public static double returnMax(int[] nums, int start) {
        int left = 0;
        int right = 0;
        int index = 0;
        double temp = start;
        while (right < nums.length - 1) {
            if (nums[index + 1] >= nums[index]) {
                right++;
            } else {
                temp = temp * (nums[right] / nums[left]);
                left = index + 1;
                right = index + 1;
            }
            index++;
        }
        temp = temp * (nums[right] / nums[left]);
        return temp;
    }

}
