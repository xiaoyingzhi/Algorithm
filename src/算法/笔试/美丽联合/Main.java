package 算法.笔试.美丽联合;

import java.util.Scanner;

/**
 * @author wh
 * @create 2018-09-28 19:51
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] temp = new int[num];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        System.out.println(sum - num);
    }

}
