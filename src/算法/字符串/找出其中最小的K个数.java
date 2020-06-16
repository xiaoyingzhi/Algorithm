package 算法.字符串;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wh
 * @create 2018-09-25 13:51
 **/
public class 找出其中最小的K个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length == 0) return res;
        if (k > input.length) return res;
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
}
