package behavior.observer.example02;



/**
 * @description: 通知者接口
 * @author: shengaojie
 * @create: 2023-12-05
 **/

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notify(String message);
}
