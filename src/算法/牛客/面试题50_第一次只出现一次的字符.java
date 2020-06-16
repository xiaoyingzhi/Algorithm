package 算法.牛客;

import java.util.HashMap;

/**
 * @author wh
 * @create 2018-10-16 15:54
 **/
public class 面试题50_第一次只出现一次的字符 {
    public static int FirstNotRepeatingChar(String str) {
        if (str.length() == 0) {
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        char temp = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], 1);
            } else {
                map.put(chars[i], i + 1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
