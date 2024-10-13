package build.singleton.hungry;

/**
 * @Author shengaojie
 * @Date 2023/8/2 09:55
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println("饿汉式---静态变量创建方式：instance 是否和instance1是同一个对象：" + (instance == instance1));

        Singleton instance2 = Singleton1.getInstance();
        Singleton instance3 = Singleton1.getInstance();
        System.out.println("饿汉式---静态代码块创建方式：instance2 是否和instance3是同一个对象：" + (instance2 == instance3));



    }
}
