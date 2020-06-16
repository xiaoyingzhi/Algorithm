package 算法.字符串;

/**
 * @author wh
 * @create 2018-09-25 16:30
 **/
public class 求出任意非负整数区间中1出现的次数 {
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
