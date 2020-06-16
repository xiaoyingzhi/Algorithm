package 算法.笔试.老虎证券;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author wh
 * @create 2018-10-13 9:53
 **/
public class 求包含ABCDE的子串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(returnLength(str, "ABCDE"));
    }

    public static int returnLength(String str, String sun) {
        char[] suns = sun.toCharArray();
        HashSet set = new HashSet();
        for (int i = 0; i < suns.length; i++) {
            set.add(suns[i]);
        }
        int left = 0;
        int right = 0;
        int index = 0;
        char[] temp = (str + str).toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        while (map.size() != sun.length() && right != temp.length) {
            if (set.contains(temp[index])) {
                if (map.containsKey(temp[index])) {
                    map.put(temp[index], map.get(temp[index]) + 1);
                } else {
                    map.put(temp[index], 1);
                }
            }
            right++;
            index++;

            if (right - left + 1 >= str.length()) {
                if (set.contains(temp[left])) {
                    if (map.containsKey(temp[left])) {
                        if (map.get(temp[left]) > 1) {
                            map.put(temp[left], map.get(temp[left]) + 1);
                        } else {
                            map.remove(temp[left]);
                        }
                    }
                }
                left++;
            }
        }
        if (map.size() == set.size()) {
            while (left <= right) {
                if (set.contains(temp[left])) {
                    if (map.get(temp[left]) > 1) {
                        map.put(temp[left], map.get(temp[left]) - 1);
                        left++;
                    } else {
                        break;
                    }
                } else {
                    left++;
                }
            }
            while (left <= right) {
                if (set.contains(temp[right])) {
                    if (map.get(temp[right]) > 1) {
                        map.put(temp[right], map.get(temp[right]) - 1);
                        right--;
                    } else {
                        break;
                    }
                } else {
                    right--;
                }
            }
        }
        return right - left + 1;
    }
}
