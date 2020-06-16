package 算法.字符串;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author wh
 * @create 2018-09-25 11:23
 **/
public class 按字典序打印出该字符串中字符的所有排列 {
    public static ArrayList<String> list = new ArrayList<>();

    public static ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) {
            return list;
        }
        char[] chars = str.toCharArray();
        getAllStr(chars, 0);
        Collections.sort(list);
        // System.out.println(list.size());
        return list;
    }

    public static void getAllStr(char[] chars, int index) {
        if (index == chars.length) {
            list.add(String.valueOf(chars));
            // System.out.println(String.valueOf(chars));
        }
        HashSet<Character> set = new HashSet<>();
        for (int j = index; j < chars.length; j++) {
            if (!set.contains(chars[j])) {
                set.add(chars[j]);
                swap(chars, index, j);
                getAllStr(chars, index + 1);
            }
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        Permutation("aa");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
