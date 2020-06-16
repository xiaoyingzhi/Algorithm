package 算法.牛客;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wh
 * @create 2018-10-16 15:52
 **/
public class 面试题45_把数组拍成最小的数 {
    public static void main(String[] args) {
        returnMinNum(new int[]{3,32,321});
    }
    public static void returnMinNum(int[] arr){
        String[] strs = new String[arr.length];
        for (int i = 0;i<arr.length;i++){
            strs[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        StringBuilder sb= new StringBuilder();
        for (int i =0;i<strs.length;i++){
            sb.append(strs[i]);
        }
        System.out.println(sb.toString());
    }
}
