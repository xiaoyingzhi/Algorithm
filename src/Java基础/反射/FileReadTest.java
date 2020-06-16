package Java基础.反射;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Create by Wang Heng on 2019-04-12
 *
 * @author Wang Heng
 */
public class FileReadTest {

    public static void main(String[] args) throws Exception {
        //通过反射获取Class对象
        //"cn.fanshe.Student"
        Class stuClass = Class.forName(getValue("className"));
        //2获取show()方法
        //show
        Method m = stuClass.getMethod(getValue("methodName"));
        //3.调用show()方法
        m.invoke(stuClass.getConstructor().newInstance());

    }

    /**
     * //此方法接收一个key，在配置文件中获取相应的value
     * @param key
     * @return
     * @throws IOException
     */

    public static String getValue(String key) throws IOException {
        //获取配置文件的对象
        Properties pro = new Properties();
        //获取输入流
        FileReader in = new FileReader("src/main/resources/pro.txt");
        ////Users/wangheng/IdeaProjects/demo/src/main/java/com/wh/反射/FileReadTest.java
        //Users/wangheng/IdeaProjects/demo/src/main/resources/pro.txt
        //将流加载到配置文件对象中
        pro.load(in);
        in.close();
        //返回根据key获取的value值
        return pro.getProperty(key);
    }


}
