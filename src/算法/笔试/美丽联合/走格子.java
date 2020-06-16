package 算法.笔试.美丽联合;

/**
 * @author wh
 * @create 2018-09-27 19:43
 **/
public class 走格子 {
    public static int sort(int xIn, int yIn, int xTo, int yTo) {
        if (xIn == xTo && yIn == yTo) {
            return 1;
        }
        if (xIn == xTo || yIn == yTo) {
            return 1;
        }
        return sort(xIn + 1, yIn, xTo, yTo) + sort(xIn, yIn - 1, xTo, yTo);
    }

}
