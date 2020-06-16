package 算法.笔试.贝壳;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author wh
 * @create 2018-10-15 20:00
 **/

/**
 * 027555+692-0xD32C
 */
public class 八进制 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] nums = str.split("[\\+\\-]");
        Queue<Character> queueChar = new LinkedList<>();
        Queue<Integer> queueNum = new LinkedList<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '+' || chars[i] == '-') {
                queueChar.add(chars[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].length() <= 2) {
                if (nums[i].substring(0, 1).equals("0")) {
                    queueNum.add(Integer.valueOf(nums[i], 8));
                } else {
                    queueNum.add(Integer.valueOf(nums[i]));
                }
            } else {
                if (nums[i].substring(0, 1).equals("0") && nums[i].substring(1, 2).equals("x")) {
                    queueNum.add(Integer.valueOf(nums[i].substring(2, nums[i].length()), 16));
                } else if (nums[i].substring(0, 1).equals("0")) {
                    queueNum.add(Integer.valueOf(nums[i], 8));
                } else {
                    queueNum.add(Integer.valueOf(nums[i]));
                }
            }
        }
        int sum = queueNum.poll();
        while (!queueNum.isEmpty()) {
            if (queueChar.poll() == '+') {
                sum += queueNum.poll();
            } else {
                sum -= queueNum.poll();
            }
        }
        System.out.println(sum);
    }
}
