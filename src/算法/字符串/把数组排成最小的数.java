package 算法.字符串;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wh
 * @create 2018-09-25 16:43
 **/
public class 把数组排成最小的数 {
    public static String PrintMinNumber(int[] numbers) {
        if (numbers.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] strings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings, new Sortnum());
        for (int i = 0; i < numbers.length; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }

    public static class Sortnum implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return (o1 + o2).compareTo(o2 + o1);
        }
    }

    public static void main(String[] args) {
        int[] x = {3, 5, 1, 4, 2};
        System.out.println(PrintMinNumber(x));
    }
}
