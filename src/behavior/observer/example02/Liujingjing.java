package behavior.observer.example02;

/**
 * @description: 具体的观察者
 * @author: shengaojie
 * @create: 2023-12-05
 **/

public class Liujingjing extends Observer{


    public Liujingjing(String name) {
        super(name);
    }

    @Override
    void update(String message) {
        System.out.println(name + "收到通知" + message);
    }
}
