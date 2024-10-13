package build.singleton.lazy;


import org.junit.Test;

import java.util.HashSet;

/**
 * @Author shengaojie
 * @Date 2023/8/2 10:08
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Singleton4 singleton4 = Singleton4.getInstance();
                set.add(singleton4);
            }).start();
        }

        System.out.println(set.size());

    }

    @Test
    public void test4(){
        System.out.println("hello");

    }
}
