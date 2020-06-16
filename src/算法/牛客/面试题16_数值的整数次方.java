package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 20:06
 **/
public class 面试题16_数值的整数次方 {
    public static void main(String[] args) {
        System.out.println(returnMi(2, 10));
    }

    public static double returnMi(double num, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (num == 1) {
            return num;
        }
        double resule = returnMi(num, exp / 2);
        resule *= resule;
        if (exp % 2 == 1) {
            resule *= num;
        }
        return resule;
    }
}
