package behavior.observer.example02;

/**
 * @description: 抽象的观察者类
 * @author: shengaojie
 * @create: 2023-12-05
 **/

public abstract class Observer {
    String name;

    public Observer(String name) {
        this.name = name;
    }

    abstract void update(String message);
}
