package 算法.笔试.贝壳;

import java.util.Scanner;

/**
 * @author wh
 * @create 2018-10-15 19:34
 **/

/**
 * 4
 * 1 2 3 4 5 6
 * 128 39 20 109 100 92
 * 1000 10 39 33 333 39
 * 101 10 10 101 20 20
 */
public class 小游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] X = new int[num];
        int[] A = new int[num];
        int[] C = new int[num];
        int[] Y = new int[num];
        int[] B = new int[num];
        int[] D = new int[num];
        for (int i = 0; i < num; i++) {
            X[i] = sc.nextInt();
            A[i] = sc.nextInt();
            C[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            B[i] = sc.nextInt();
            D[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            long xtime = (long) Math.ceil(X[i] / B[i]) * D[i];
            long ytime = (long) Math.ceil(Y[i] / A[i]) * C[i];
            if (xtime == ytime) {
                System.out.println("TIE");
            } else if (xtime > ytime) {
                System.out.println("XIAOZHI");
            } else {
                System.out.println("XIAOCHUN");
            }
        }
    }
}
