package build.singleton.lazy;

/**
 * @Author shengaojie
 * @Date 2023/8/2 10:02
 * @ClassName: Singleton3
 * @Description: 懒汉式--静态内部方式
 * @Version 1.0
 */
public class Singleton3 {
    private static Singleton3 instance;

    private static class SingletonCreate{
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return SingletonCreate.INSTANCE;
    }
}
