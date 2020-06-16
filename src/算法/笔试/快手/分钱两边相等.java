package 算法.笔试.快手;

/**
 * @author wh
 * @create 2018-09-25 19:43
 **/

import java.util.Scanner;

public class 分钱两边相等 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 0) {
            System.out.println("0");
            return;
        }
        int[] moneys = new int[num];
        for (int i = 0; i < num; i++) {
            moneys[i] = in.nextInt();
        }

        int left = 0;
        int right = 0;
        int leftIndex = -1;
        int rightIndex = moneys.length;
        int max = 0;
        while (leftIndex < rightIndex) {
            while (left == right && leftIndex < rightIndex) {
                max = Math.max(left, max);

                left += moneys[++leftIndex];
                right += moneys[--rightIndex];
            }
            while (left < right && leftIndex < rightIndex) {
                left += moneys[++leftIndex];
            }
            while (left > right && leftIndex < rightIndex) {
                right += moneys[--rightIndex];
            }

        }
        System.out.println(max);
    }
}
