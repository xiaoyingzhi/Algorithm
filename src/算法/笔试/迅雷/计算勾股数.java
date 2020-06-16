package 算法.笔试.迅雷;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author wh
 * @create 2018-10-12 10:36
 **/
public class 计算勾股数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        System.out.println(gougu(temp));

    }

    public static int gougu(int temp) {
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 1; i < temp; i++) {
            for (int j = i; j < temp; j++) {
                int he = i * i + j * j;
                int c = (int) Math.sqrt(he);
                if (c * c == he && c <= temp) {
                    if (!set.contains(i + "" + j + c)) {
                        if (i % 2 == j % 2 || i % 3 == j % 3 || i % 5 == j % 5 || i % 7 == j % 7) {

                        } else {
                            count++;
                        }
                    }

                    set.add(i + "" + j + c);
                }
            }
        }
        return count;
    }
}
