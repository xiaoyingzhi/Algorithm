package 算法.字符串;

import java.util.ArrayList;

/**
 * @author wh
 * @create 2018-09-29 18:04
 **/
public class 输出所有和为S的连续正数序列 {
    public static ArrayList<ArrayList<Integer>> lisAll = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int left = 0;
        int right = 0;
        int temp = 0;
        while (left < sum - 1) {
            if (temp < sum) {
                temp += ++right;
            }
            if (temp > sum) {
                temp -= left++;
            }
            if (temp == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = left == 0 ? left + 1 : left; i <= right; i++) {
                    list.add(i);
                }
                lisAll.add(list);
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
                right++;
                temp += right;
            }
        }
        return lisAll;
    }

    public static void main(String[] args) {
        FindContinuousSequence(4);
    }
}
