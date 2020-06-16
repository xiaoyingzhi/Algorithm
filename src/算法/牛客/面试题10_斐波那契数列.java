package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 12:55
 **/
public class 面试题10_斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(fibonacci01(5));
    }

    public static int fibonacci(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static int fibonacci01(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        int[] dp = new int[i + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int j = 2; j <= i; j++) {
            dp[j] = dp[j - 1] + dp[j - 2];
        }
        return dp[i];
    }
}
