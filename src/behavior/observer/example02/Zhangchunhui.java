package behavior.observer.example02;

/**
 * @description: 具体的观察者类
 * @author: shengaojie
 * @create: 2023-12-05
 **/

public class Zhangchunhui extends Observer{

    public Zhangchunhui(String name) {
        super(name);
    }

    @Override
    void update(String message) {
        System.out.println(name + "收到通知" + message);
    }
}
