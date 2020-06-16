package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-16 15:52
 **/
public class 面试题47_礼物的最大价值 {

    public static int returnMaxV(int[][] maxt) {
        int[][] dp = new int[maxt.length][maxt[0].length];
        dp[maxt.length - 1][maxt[0].length - 1] = maxt[maxt.length - 1][maxt[0].length - 1];

        for (int i = maxt.length - 2; i >= 0; i--) {
            dp[i][maxt[0].length - 1] = dp[i + 1][maxt[0].length - 1] + maxt[i][maxt[0].length - 1];
        }

        for (int i = maxt[0].length - 2; i >= 0; i--) {
            dp[maxt.length - 1][i] = dp[maxt.length - 1][i + 1] + maxt[maxt.length - 1][i];
        }

        for (int i = maxt.length - 2; i >= 0; i--) {
            for (int j = maxt[0].length - 2; j >= 0; j--) {
                dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]) + maxt[i][j];
            }
        }
        return dp[0][0];
    }
}
