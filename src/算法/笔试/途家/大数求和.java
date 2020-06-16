package 算法.笔试.途家;

import java.util.Scanner;

/**
 * @author wh
 * @create 2018-10-16 19:44
 **/
public class 大数求和 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        String temp = null;
        if (first.length() >= second.length()) {
            temp = isGood(first, second);
        } else {
            temp = isGood(second, first);
        }
        System.out.println(temp);
    }

    public static String isGood(String first, String second) {
        int fl = first.length();
        int sl = second.length();
        int m[] = new int[fl];
        int n[] = new int[fl];
        for (int i = 0; i < fl; i++) {
            m[i] = Integer.parseInt(new StringBuffer().append(first.charAt(i)).toString());
        }
        for (int j = 0; j < sl; j++) {
            if (j < fl - sl) n[j] = 0;
            n[j + fl - sl] = Integer.parseInt(new StringBuffer().append(second.charAt(j)).toString());
        }
        return cacalute(m, n);
    }

    public static String cacalute(int[] m, int[] n) {
        int result[] = new int[m.length];
        for (int i = 0; i < n.length; i++) {
            result[i] = m[i] + n[i];
        }
        StringBuffer sb = new StringBuffer();
        for (int i = n.length - 1; i >= 1; i--) {
            if (result[i] >= 10) {
                result[i - 1] += 1;
                result[i] -= 10;
            }
            sb.append(result[i]);
        }
        if (result[0] >= 10) {
            sb.append(result[0] - 10 + "1");
        } else {
            sb.append(result[0]);
        }
        return sb.reverse().toString();
    }

}
