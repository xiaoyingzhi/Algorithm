package 算法.字符串;

/**
 * @author wh
 * @create 2018-09-29 20:11
 **/
public class 左选择字符串 {
    public static String LeftRotateString(String str, int n) {
        if (str == null || str.equals("")) {
            return "";
        }
        return (str + str).substring(n, str.length() + n);
    }

    public static void main(String[] args) {
        System.out.println(LeftRotateString("abcXYZdef", 3));
    }
}
