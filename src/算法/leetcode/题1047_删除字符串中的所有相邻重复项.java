package 算法.leetcode;

import java.util.Stack;

/**
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * <p>
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * <p>
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangheng
 * @date 2020-06-19
 */
public class 题1047_删除字符串中的所有相邻重复项 {

    class Solution {
        public String removeDuplicates(String S) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < S.length(); i++) {
                if (!stack.isEmpty() && S.charAt(i) == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(S.charAt(i));
                }
            }
            StringBuilder str = new StringBuilder();
            for (Character character : stack) {
                str.append(character);
            }
            return str.toString();
        }
    }

    class Solution1 {
        public String removeDuplicates(String S) {
            StringBuilder sb = new StringBuilder();
            int sbLength = 0;
            for (char character : S.toCharArray()) {
                if (sbLength != 0 && character == sb.charAt(sbLength - 1))
                    sb.deleteCharAt(sbLength-- - 1);
                else {
                    sb.append(character);
                    sbLength++;
                }
            }
            return sb.toString();
        }
    }
}
