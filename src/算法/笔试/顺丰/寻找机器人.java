package 算法.笔试.顺丰;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author wh
 * @create 2018-10-13 16:50
 **/
public class 寻找机器人 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] temp01 = new int[num];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            temp01[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            map.put(sc.nextInt(), i);
        }
        System.out.println(returnNum(temp01, map));
    }

    public static int returnNum(int[] temp01, HashMap<Integer, Integer> map) {
        int count = 0;
        for (int i = 0; i < temp01.length; i++) {
            count += Math.abs(map.get(temp01[i]) - i);
        }
        return count / 2;
    }
}
