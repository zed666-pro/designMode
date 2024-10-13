package structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: some desc
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/11 14:55
 */
public class ProxyFactory  {

    //这里聚合了被代理的目标类，后面调用的实际上是station的方法
    private Station station = new Station();

    public SellTickets getProxyObject(){
        //使用Proxy获取代理对象
        /** newProxyInstance()方法参数说明：
         *          ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载 器即可
                    Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代 理对象实现相同的接口 InvocationHandler
                     h ： 代理对象的调用处理程序 */
     SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("动态代理的中介收取一定的费用");
                        Object result = method.invoke(station,args);

                        return result;
                    }
                }
        );

        return sellTickets;
    }
}
