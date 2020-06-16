package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 12:52
 **/
public class 面试题04_二维数组中的查找 {
    public static void main(String[] args) {
        int[][] temp = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(returnHasNum(temp, 5));
    }

    public static boolean returnHasNum(int[][] temp, int num) {
        int len = 0;
        int row = temp[0].length - 1;
        while (len != temp.length - 1 && row != 0) {
            if (temp[len][row] == num) {
                return true;
            } else if (temp[len][row] > num) {
                row--;
            } else {
                len++;
            }
        }
        return false;
    }
}
