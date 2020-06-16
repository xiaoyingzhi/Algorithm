package 算法.字符串;

import java.util.ArrayList;

/**
 * @author wh
 * @create 2018-09-24 11:02
 **/
public class 顺时针打印矩阵 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        //printMatrix(matrix);
    }

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int aX = 0;
        int aY = 0;
        int bX = matrix.length - 1;
        int bY = matrix[0].length - 1;
        while (aX <= bX && aY <= bY) {
            if (aX == bX) {
                for (int i = aY; i <= bY; i++) {
                    list.add(matrix[aX][i]);
                    //System.out.println(matrix[aX][i]);
                }
            } else if (aY == bY) {
                for (int i = aX; i <= bX; i++) {
                    list.add(matrix[i][aY]);
                    //.out.println(matrix[i][aY]);
                }
            } else {
                int curX = aX;
                int curY = aY;
                while (curY != bY) {
                    list.add(matrix[aX][curY++]);
                    //System.out.println(matrix[aX][curY++]);
                }
                while (curX != bX) {
                    list.add(matrix[curX++][bY]);
                    // System.out.println(matrix[curX++][bY]);
                }
                while (curY != aY) {
                    list.add(matrix[bX][curY--]);
                    //System.out.println(matrix[bX][curY--]);
                }
                while (curX != aX) {
                    list.add(matrix[curX--][aY]);
                    //System.out.println(matrix[curX--][aY]);
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
