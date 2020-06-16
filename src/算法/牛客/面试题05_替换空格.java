package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 12:53
 **/
public class 面试题05_替换空格 {
    public static void main(String[] args) {
        System.out.println(returnRep("We are happy"));
    }

    public static String returnRep(String str) {
        return str.replace(" ", "%20");
    }
}
