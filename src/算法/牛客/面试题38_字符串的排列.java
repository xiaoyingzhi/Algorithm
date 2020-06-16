package 算法.牛客;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author wh
 * @create 2018-10-14 20:17
 **/
public class 面试题38_字符串的排列 {
    public static void main(String[] args) {
        allStr("abc");
    }

    public static ArrayList<String> list = new ArrayList<>();

    public static ArrayList<String> allStr(String str) {
        char[] chars = str.toCharArray();
        all(chars, 0);
        return list;
    }

    public static void all(char[] arr, int index) {
        if (index == arr.length) {
            System.out.println(String.valueOf(arr));
            list.add(String.valueOf(arr));
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = index; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                swap(arr, i, index);
                all(arr, index + 1);
                swap(arr, i, index);
            }
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
