package build.singleton.lazy;

/**
 * @Author shengaojie
 * @Date 2023/8/2 10:01
 * @ClassName: Singleton2
 * @Description: 懒汉式--线程安全方式
 * @Version 1.0
 */
public class Singleton2 {
    private static Singleton2 instance;

    public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
