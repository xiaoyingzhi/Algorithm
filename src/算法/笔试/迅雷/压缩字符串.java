package 算法.笔试.迅雷;

import java.util.Scanner;

public class 压缩字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toNum01(str));
    }

    /**
     * 顺序正常版本压缩字符串
     *
     * @param str
     * @return
     */
    public static String toNum01(String str) {
        if (str == null || str.length() == 1) {
            return str;
        }
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int temp = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                temp++;
            } else {
                if (temp == 1) {
                    sb.append(chars[i - 1]);
                } else {
                    sb.append(chars[i - 1] + "" + temp);
                }
                temp = 1;
            }
            if (chars.length - 1 == i) {
                if (chars[i] == chars[i - 1]) {
                    sb.append(chars[i] + "" + temp);
                } else {
                    sb.append(chars[i]);
                }
            }
        }
        return sb.toString();
    }
}
