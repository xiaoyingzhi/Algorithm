package 算法.牛客;

import java.util.ArrayList;

/**
 * @author wh
 * @create 2018-10-14 20:12
 **/
public class 面试题29_顺时针打印矩阵 {

    public static ArrayList<Integer> print(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int aX = 0;
        int aY = 0;
        int bX = matrix.length - 1;
        int bY = matrix[0].length - 1;

        while (aX <= bX && aY <= bY) {
            if (aX == bX) {
                for (int i = aY; i <= bY; i++) {
                    list.add(matrix[aX][i]);
                }
            } else if (aY == bY) {
                for (int i = aX; i <= bX; i++) {
                    list.add(matrix[i][aY]);
                }
            } else {
                int curX = aX;
                int curY = aY;
                while (curY != bY) {
                    list.add(matrix[aX][curY++]);
                }
                while (curX != bX) {
                    list.add(matrix[curX++][bY]);
                }
                while (curY != aY) {
                    list.add(matrix[bX][curY--]);
                }
                while (curX != aX) {
                    list.add(matrix[curX--][aY]);
                }
            }
            aX++;
            aY++;
            bX--;
            bY--;
        }
        return list;
    }
}
