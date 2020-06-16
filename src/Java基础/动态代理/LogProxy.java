package Java基础.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.LocalDateTime;

/**
 * Create by Wang Heng on 2019-04-16
 *
 * @author Wang Heng
 */
public class LogProxy implements InvocationHandler{

    private Object object;

    public LogProxy(Object object){
        this.object = object;
    }

    public static Object proxy(Object object){
        //创建中介类实例
        InvocationHandler handler = new LogProxy(object);
        //获取类加载器
        ClassLoader cl = object.getClass().getClassLoader();
        //动态产生一个代理类
        return Proxy.newProxyInstance(cl, object.getClass().getInterfaces(), handler);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        //获得对象
        System.out.println("对象："+object);
        //获得类
        System.out.println("类："+object.getClass().getName());
        //获得方法名字
        System.out.println("方法："+method.getName());
        //获得参数
        System.out.println("参数："+args[0]);

        //执行方法
        System.out.println("-----------开始执行方法--------------");
        Object result =method.invoke(object, args);
        System.out.println("-----------执行方法完毕--------------");

        //获得执行方法后的返回参数
        System.out.println("获得方法执行后的参数："+result);
        after();
        return result;
    }

    private void before(){
        System.out.println("执行之前的时间:"+ LocalDateTime.now());
    }

    private void after(){
        System.out.println("执行之后的时间:"+LocalDateTime.now());
    }
}
