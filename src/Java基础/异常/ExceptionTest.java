package Java基础.异常;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Create by Wang Heng on 2019-04-11
 *
 * @author Wang Heng
 */
public class ExceptionTest {
    public static void main(String[] args) {
        LocalDate beginDateTime = LocalDate.parse("2018-11-23", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        String str = "2017-11-21 14:41:06:612";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
        LocalDate date = LocalDate.parse(str, fmt);
        System.out.println(returnNum());
    }

    private static Integer returnNum(){
        try {
            System.out.println("111");
            int x = 9/0;
            return 1;
        }catch (Exception e){
            System.out.println("222");
            return 2;
        }finally {
            System.out.println("333");
            return 3;
        }
    }

    public static LocalDate strToLocalDate(String str) {

        return LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static int getDataByIndex(int index,int[] data) {
        if(index<0||index>=data.length){
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }
        return data[index];
    }
    public static void createFile()  {
        File file = new File("d:/a.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
