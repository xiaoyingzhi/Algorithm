package 算法.笔试.途家;

import java.util.Scanner;

/**
 * @author wh
 * @create 2018-10-16 19:47
 **/
public class 寻找最大数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        int n = sc.nextInt();
        int len = m.length();
        char[] vec = m.toCharArray();
        int new_len = m.length() - n;
        char[] res = new char[new_len];
        for (int i = m.length() - new_len, j = 0; j < new_len; i++, j++) {
            res[j] = vec[i];
        }
        int max = 0;
        for (int i = 0; i < new_len; i++) {
            int flag = 1;
            for (int j = max; j < len - new_len; j++) {
                if (res[i] <= vec[j]) {
                    res[i] = vec[j];
                    max = j;
                    vec[max] = '0';
                    flag = 0;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        for (int i = 0; i < new_len; i++) {
            System.out.print(res[i]);
        }
    }
}
