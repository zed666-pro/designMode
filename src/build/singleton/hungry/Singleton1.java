package build.singleton.hungry;

/**
 * @Author shengaojie
 * @Date 2023/8/2 09:54
 * @ClassName: Singleton1
 * @Description: 静态代码块方式创建
 * @Version 1.0
 */
public class Singleton1 {
    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
