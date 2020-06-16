package 算法.字符串;

/**
 * @author wh
 * @create 2018-09-29 20:17
 **/
public class 翻转单词顺序列 {
    public static String ReverseSentence(String str) {
        if (str.trim().equals("")) {
            return str;
        }
        String[] split = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(ReverseSentence("student. a am I"));

    }
}
