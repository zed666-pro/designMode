package build.singleton.hungry;

/**
 * @Author shengaojie
 * @Date 2023/8/2 09:52
 * @ClassName: Singleton
 * @Description: 饿汉式(静态变量方法实现)
 * @Version 1.0
 */
public class Singleton {
    private static Singleton singleton = new Singleton();


    public static Singleton getInstance(){
        return singleton;
    }
}
