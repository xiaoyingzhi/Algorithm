package Java基础.动态代理;

/**
 * Create by Wang Heng on 2019-04-16
 *
 * @author Wang Heng
 */
public class Test {

    public static void main(String[] args){
        ICoder coder = (ICoder) LogProxy.proxy(new PythonCoder("wang"));
        coder.doThings("编写运营模块");
    }
}