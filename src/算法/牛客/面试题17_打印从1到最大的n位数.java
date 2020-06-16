package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 20:07
 **/
public class 面试题17_打印从1到最大的n位数 {
    public static void main(String[] args) {
        printN(3);
    }

    public static void printN(int n) {
        if (n <= 0) {
            return;
        }
        char[] number = new char[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = '0';
        }
        for (int i = 0; i < 10; ++i) {
            number[0] = (char) (i + '0');
            printAll(number, n, 0);
        }
    }

    public static void printAll(char[] number, int length, int index) {
        if (index == length - 1) {
            System.out.print(Integer.valueOf(String.valueOf(number)) + " ");
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[index + 1] = (char) (i + '0');
            printAll(number, length, index + 1);
        }
    }
}
