package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 12:57
 **/
public class 面试题14_剪绳子 {
    public static void main(String[] args) {
        System.out.println(returnMax(8));
    }

    public static int returnMax(int length) {
        if (length < 2) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        int[] dp = new int[length + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= length; i++) {
            for (int j = 1; j <= i / 2; j++) {
                dp[i] = Math.max(dp[j] * dp[i - j], dp[i]);
            }
        }
        return dp[length];
    }
}
