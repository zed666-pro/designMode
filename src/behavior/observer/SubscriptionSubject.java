package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 具体的主题类（被观察的类）
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 17:23
 */


public class SubscriptionSubject implements Subject{


    //聚合所有的订阅者对象
    private List<Observer> userList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        userList.remove(observer);
    }

    //通知所有的观察者对象去更新
    @Override
    public void notify(String message) {
        for (Observer observer : userList) {
            observer.update(message);
        }

    }
}
