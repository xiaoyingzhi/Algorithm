package 算法.笔试.快手;

import java.util.Scanner;

/**
 * @author wh
 * @create 2018-09-25 20:22
 **/
public class 求和二叉树 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 4 2 5 1 6 3 7
        String[] str1 = in.nextLine().split(" ");
        String[] str2 = in.nextLine().split(" ");
        int len = str2.length;
        // int[] qian = new int[len];
        int[] zhong = new int[len];
        for (int i = 0; i < len; i++) {
            // qian[i] = Integer.valueOf(str1[i]);
            zhong[i] = Integer.valueOf(str2[i]);
        }
        int[] temp = new int[len];
        sort(zhong, temp, 0, len - 1, len / 2);
        for (int i = 0; i < len; i++) {
            if (i != len - 1) {
                System.out.print(temp[i] + " ");
            } else {
                System.out.print(temp[i]);
            }
        }
    }

    public static int sort(int[] zhong, int[] temp, int left, int right, int mid) {
        if (left == right) {
            return zhong[left];
        }
        temp[mid] = sort(zhong, temp, left, mid - 1, (0 + mid - 1) / 2) + sort(zhong, temp, mid + 1, right, (mid + 1 + right) / 2);
        return temp[mid] + zhong[mid];
    }
}
