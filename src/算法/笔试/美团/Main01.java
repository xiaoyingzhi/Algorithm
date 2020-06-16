package 算法.笔试.美团;

/**
 * @author wh
 * @create 2018-10-09 20:51
 **/
public class Main01 {
    public static void main(String[] args) {
        System.out.println(Math.ceil(2));
        String str = "0xD32C";
        System.out.println("十六进制转十进制：" + Integer.valueOf(str.substring(2, str.length()), 16).toString());
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(1, 2));
        int a = Integer.valueOf("027555", 8);
        int b = Integer.valueOf("D32C", 16);
        System.out.println(a - b + 692);
        String sss = "0";
        //System.out.println(sss.substring(1,2));
        System.out.println(Math.ceil(2.5));
    }
}
