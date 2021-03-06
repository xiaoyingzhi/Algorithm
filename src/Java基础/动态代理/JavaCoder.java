package Java基础.动态代理;

/**
 * Create by Wang Heng on 2019-04-16
 *
 * @author Wang Heng
 */
public class JavaCoder implements ICoder {

    private String name;

    public JavaCoder(String name){
        this.name = name;
    }

    @Override
    public String doThings(String demandName) {
        System.out.println("Java工程师"+name + " 接收了任务:" + demandName);
        return "我是Java工程师，我任务完成了！";
    }
}