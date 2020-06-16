package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 12:57
 **/
public class 面试题15_二进制中1的个数 {
    public static void main(String[] args) {
        System.out.println(returnCount1(9));
    }

    public static int returnCount1(int i) {
        int count = 0;
        while (i != 0) {
            i = (i - 1) & i;
            count++;
        }
        return count;
    }
}
