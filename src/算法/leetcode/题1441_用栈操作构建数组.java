package 算法.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个目标数组 target 和一个整数 n。每次迭代，需要从  list = {1,2,3..., n} 中依序读取一个数字。
 * <p>
 * 请使用下述操作来构建目标数组 target ：
 * <p>
 * Push：从 list 中读取一个新元素， 并将其推入数组中。
 * Pop：删除数组中的最后一个元素。
 * 如果目标数组构建完成，就停止读取更多元素。
 * 题目数据保证目标数组严格递增，并且只包含 1 到 n 之间的数字。
 * <p>
 * 请返回构建目标数组所用的操作序列。
 * <p>
 * 题目数据保证答案是唯一的。
 * <p>
 * 示例 1：
 * <p>
 * 输入：target = [1,3], n = 3
 * 输出：["Push","Push","Pop","Push"]
 * 解释：
 * 读取 1 并自动推入数组 -> [1]
 * 读取 2 并自动推入数组，然后删除它 -> [1]
 * 读取 3 并自动推入数组 -> [1,3]
 * 示例 2：
 * <p>
 * 输入：target = [1,2,3], n = 3
 * 输出：["Push","Push","Push"]
 * 示例 3：
 * <p>
 * 输入：target = [1,2], n = 4
 * 输出：["Push","Push"]
 * 解释：只需要读取前 2 个数字就可以停止。
 * 示例 4：
 * <p>
 * 输入：target = [2,3,4], n = 4
 * 输出：["Push","Pop","Push","Push","Push"]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/build-an-array-with-stack-operations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangheng
 * @date 2020-06-19
 */
public class 题1441_用栈操作构建数组 {

    //输入
    //[1,3]
    //3
    //输出
    //[]
    //预期结果
    //["Push","Push","Pop","Push"]

    class Solution {
        public List<String> buildArray(int[] target, int n) {
            List<String> list = new ArrayList<>();

            int j = 0;
            for (int i = 1; i <= n; i++) {
                if (target[j] > i) {
                    list.add("Push");
                    list.add("Pop");
                } else {
                    list.add("Push");
                    j++;
                }
                if (j == target.length) {
                    break;
                }
            }
            return list;
        }
    }

    class Solution1 {
        public List<String> buildArray(int[] target, int n) {
            List<String> result = new ArrayList<>();
            int j = 1;
            for (int i = 0; i < target.length; i++) {
                while (target[i] > j) {
                    result.add("Push");
                    result.add("Pop");
                    j++;
                }
                result.add("Push");
                j++;
            }
            return result;
        }
    }
}
