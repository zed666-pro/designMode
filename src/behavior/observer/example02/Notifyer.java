package behavior.observer.example02;


import behavior.observer.example02.Subject;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 通知者
 * @author: shengaojie
 * @create: 2023-12-05
 **/

public class Notifyer implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private String state;


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
