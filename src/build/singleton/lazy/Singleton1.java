package build.singleton.lazy;

/**
 * @Author shengaojie
 * @Date 2023/8/2 09:59
 * @ClassName: Singleton1
 * @Description: 线程不安全方式
 * @Version 1.0
 */
public class Singleton1 {
    private static Singleton1 singleton1;

    public static Singleton1 getInstance(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
