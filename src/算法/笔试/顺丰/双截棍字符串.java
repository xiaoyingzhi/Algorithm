package 算法.笔试.顺丰;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wh
 * @create 2018-10-13 16:17
 **/
public class 双截棍字符串 {
    public static class Node {
        Character name;
        int count;

        public Node(Character name, int count) {
            this.name = name;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(returnStr(str));
    }

    public static String returnStr(String str) {
        char[] strs = str.toCharArray();
        ArrayList<Node> list = new ArrayList<>();
        if (strs == null || strs.length < 2) {
            return strs.toString();
        }
        int count = 1;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i] == strs[i - 1]) {
                count++;
                if (i == strs.length - 1) {
                    list.add(new Node(strs[i - 1], count));
                }
            } else {
                list.add(new Node(strs[i - 1], count));
                count = 1;
            }
        }
        int maxL = 0;
        int left = -1;
        int right = -1;
        int index = 0;
        for (int i = 0; i < list.size() - 2; i++) {
            if (list.get(i).count > list.get(i + 1).count && list.get(i).count == list.get(i + 2).count) {
                int maxTemp = list.get(i).count + list.get(i + 1).count + list.get(i + 2).count;
                if (maxTemp > maxL) {
                    maxL = maxTemp;
                    left = index;
                    right = index + maxTemp - 1;
                }
            }
            index += list.get(i).count;
        }
        if (left != -1) {
            return str.substring(left, right + 1);
        }
        return "";
    }
}
