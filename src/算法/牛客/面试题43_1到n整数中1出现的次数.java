package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-16 15:51
 **/
public class 面试题43_1到n整数中1出现的次数 {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n <= 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i <= n; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '1') {
                    count++;
                }
            }
        }
        return count;
    }
}
