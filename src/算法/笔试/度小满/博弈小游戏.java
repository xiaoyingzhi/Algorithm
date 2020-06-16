package 算法.笔试.度小满;

import java.util.Scanner;

/**
 * @author wh
 * @create 2018-09-26 15:57
 **/

/**
 * 有一天，小A和小B玩了一个神奇的游戏，游戏开始时，
 * 桌面上有a0个不同盒子和b0个不同的物品，每个回合，
 * 两个人可以选择增加一个新的盒子或者一个新的物品(所有物品和盒子都不同)，
 * 记当前桌子上的盒子数量为a，物品数量为b，当把b个物品放入a个盒子的方案数不小于n时，
 * 游戏结束，此时最后一位操作者判负。
 * 给出a0，b0，n，如果小A先手，两个人都采用最优策略，
 * 谁能获胜，如果A获胜输出“A”，如果B获胜，输出“B”，如果是平局，输出“A&B”。
 */
public class 博弈小游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int hezi = sc.nextInt();
            int ball = sc.nextInt();
            int n = sc.nextInt();
            if (Math.pow(hezi + 1, ball) >= n && Math.pow(hezi, ball + 1) >= n) {
                System.out.println("A&B");
                continue;
            }
            boolean ho = isHo(hezi, ball, true, n);
            if (ho) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }

    public static boolean isHo(int a, int b, boolean bool, int n) {
        if (Math.pow(a + 1, b) >= n && Math.pow(a, b + 1) >= n) {
            return bool;
        } else if (Math.pow(a + 1, b) < n && Math.pow(a, b + 1) >= n) {
            return isHo(++a, b, !bool, n);
        } else if (Math.pow(a, b + 1) < n && Math.pow(a + 1, b) >= n) {
            return isHo(a, ++b, !bool, n);
        } else {
            boolean big = isBig(a, b);
            if (big) {
                return isHo(++a, b, !bool, n);
            } else {
                return isHo(a, ++b, !bool, n);
            }
        }

    }

    public static boolean isBig(int a, int b) {
        if ((Math.pow(a + 2, b) > Math.pow(a + 1, b + 1) && Math.pow(a + 2, b) > Math.pow(a, b + 2))
                || (Math.pow(a + 1, b + 1) > Math.pow(a, b + 2))) {
            return true;
        }
        return false;
    }
}
