package 算法.笔试.美团;

import java.util.Scanner;

/**
 * @author wh
 * @create 2018-10-09 19:02
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int money = sc.nextInt();
        int[] cook = new int[num];
        for (int i = 0; i < num; i++) {
            cook[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < cook.length; i++) {
            temp += cook[i];
        }
        if (temp < money) {
            System.out.println("0");
            return;
        }
        sort(cook, 0, 0, money);
        System.out.println(tempMax);

    }

    public static int tempMax = Integer.MAX_VALUE;

    public static int sort(int[] temp, int index, int now, int money) {
        if (now >= money) {
            tempMax = Math.min(tempMax, now);
            return now;
        }
        if (index == temp.length) {
            return now;
        }
        return Math.min(sort(temp, index + 1, now + temp[index], money), sort(temp, index + 1, now, money));
    }
}
