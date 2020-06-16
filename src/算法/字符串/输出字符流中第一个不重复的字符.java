package 算法.字符串;

/**
 * @author wh
 * @create 2018-09-30 14:01
 **/
public class 输出字符流中第一个不重复的字符 {
    int[] count = new int[256];
    int index = 1;  //标注字符的序号

    //Insert one char from stringstream
    public void Insert(char ch) {
        if (count[ch] == 0) {
            count[ch] = index++;
        } else {
            count[ch] = -1;
        }
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        int temp = Integer.MAX_VALUE;
        char ch = '#';
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0 && count[i] != -1 && count[i] < temp) {
                temp = count[i];
                ch = (char) i;
            }
        }
        return ch;
    }
}
