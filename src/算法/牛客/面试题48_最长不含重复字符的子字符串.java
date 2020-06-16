package 算法.牛客;

import java.util.HashMap;

/**
 * @author wh
 * @create 2018-10-16 15:53
 **/
public class 面试题48_最长不含重复字符的子字符串 {
    public static void main(String[] args) {
        System.out.println(findLargeLength("abc"));
    }

    /**
     * 输出最长非重复子串长度
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param str
     * @return
     */
    public static String findLargeLength(String str) {
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>(0);
        int maxSize = 0;
        int index = 0;
        int left = 0;
        int right = 0;
        for (int i = 0, len = chars.length; i < len; i++) {
            if (map.containsKey(chars[i])) {
                index = Math.max((map.get(chars[i]) + 1), index);
            }
            map.put(chars[i], i);
            if (maxSize < (i - index + 1)) {
                maxSize = i - index + 1;
                left = index;
                right = i;
            }
        }
        return str.substring(left, right + 1);
    }

}
